import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            // Caminho do arquivo JSON
            String caminhoArquivo = "faturamento.json";

            // Ler o conteúdo do arquivo JSON
            String conteudo = new String(Files.readAllBytes(Paths.get(caminhoArquivo)));

            // Parsear o conteúdo para um JSONArray
            JSONArray faturamentoMensal = new JSONArray(conteudo);

            List<Dado> listaDeDados = new ArrayList<>();

            // Variáveis para cálculo
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasAcimaMedia = 0;

            // Preencher a lista com os dados do faturamento e calcular a soma
            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject jsonObject = faturamentoMensal.getJSONObject(i);

                int dia = jsonObject.getInt("dia");
                double faturamento = jsonObject.getDouble("faturamento");

                listaDeDados.add(new Dado(dia, faturamento));

                // Acumular o faturamento para o cálculo da média
                somaFaturamento += faturamento;

                // Atualizar menor e maior faturamento, ignorando valores zero
                if (faturamento > 0) {
                    if (faturamento < menorFaturamento) {
                        menorFaturamento = faturamento;
                    }
                    if (faturamento > maiorFaturamento) {
                        maiorFaturamento = faturamento;
                    }
                }
            }

            // Calcular a média do faturamento
            double mediaMensal = somaFaturamento / listaDeDados.size();

            // Contar quantos dias tiveram faturamento superior à média
            for (Dado dado : listaDeDados) {
                if (dado.getFaturamento() > mediaMensal) {
                    diasAcimaMedia++;
                }
            }

            // Exibir resultados
            System.out.println("• O menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento);
            System.out.println("• O maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento);
            System.out.println("• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}