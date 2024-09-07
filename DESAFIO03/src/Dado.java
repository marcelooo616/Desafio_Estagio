public class Dado {

    Integer dia;
    Double faturamento;

    public Dado() {

    }

    public Dado(Integer dia, Double faturamento) {
        this.dia = dia;
        this.faturamento = faturamento;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }
}
