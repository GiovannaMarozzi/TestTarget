package tests.dados;

public class Dados implements Comparable <Dados>{
    private int dia;
    private double valor;

    public Dados(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " dia: " + this.dia + ", com o valor de: " + this.valor ;
    }

    @Override
    public int compareTo(Dados dados) {
        if (this.getValor() > dados.getValor()) {
            return 1;
        } else if (this.getValor() < dados.getValor()) {
            return -1;
        }
        return 0;
    }
}
