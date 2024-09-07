import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
         * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
         * Imprimir(SOMA);
         * Ao final do processamento, qual será o valor da variável SOMA? Resposta 91.
         *
         */

        int indice = 13;
        int soma = 0;
        int k = 0;
        do {
            k = k + 1;
            soma = soma + k;
        }while (k < indice);
        System.out.println(soma);


        /**
         *
         *2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
         *
         * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
         *
         */
        int numero = 76;
        int a = 0;
        int b = 1;


        ArrayList fibo = new ArrayList<>();
        fibo.add(0,0);
        fibo.add(1,1);

        do{
            soma = a + b;
            fibo.add(soma);
            a = b;
            b = soma;
        }while (soma < numero);
        System.out.println(fibo);
        String pertence = fibo.contains(numero) ? "Este numero pertence a fibo" : "Este numero não pertence a fibo";
        System.out.println(pertence);


        /**
         *
         *4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
         * • SP – R$67.836,43
         * • RJ – R$36.678,66
         * • MG – R$29.229,88
         * • ES – R$27.165,48
         * • Outros – R$19.849,53
         *
         * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
         *
         */
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double OUTROS = 19849.53;
        double total = SP+RJ+MG+ES+OUTROS;
        double faturamentoTotal = total;

        System.out.println("faturamento total: "+faturamentoTotal);

        double percentSP = (SP/faturamentoTotal) * 100;
        System.out.printf("O percentual de SP é %.2f%%\n", percentSP);

        double percentRJ = (RJ/faturamentoTotal) * 100;
        System.out.printf("O percentual de RJ é %.2f%%\n", percentRJ);

        double percentMG = (MG/faturamentoTotal) * 100;
        System.out.printf("O percentual de MG é %.2f%%\n", percentMG);

        double percentES = (ES/faturamentoTotal) * 100;
        System.out.printf("O percentual de ES é %.2f%%\n", percentES);

        double percentOutros = (OUTROS/faturamentoTotal) * 100;
        System.out.printf("O percentual de OUTROS é %.2f%%\n", percentOutros);

        double TOTALpERCENT = percentSP + percentRJ+ percentMG+ percentES+ percentOutros;


        /**
         *
         * 5) Escreva um programa que inverta os caracteres de um string.
         *
         * IMPORTANTE:
         * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
         * b) Evite usar funções prontas, como, por exemplo, reverse;
         *
         *
         */
        String s = "ESTA VAGA E MINHA!";
        StringBuilder palavra = new StringBuilder("");
        char[] c = s.toCharArray();

        for (int i = c.length - 1; i >= 0; i--){
            palavra.append(c[i]);
        }
        System.out.println(palavra);


    }
}