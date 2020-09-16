package aula06.exercicioConta;

public class Conta {
    // atributos
    private int numero;
    private double saldo;

    // construtor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // metodos
    public double getSaldo() {
        return saldo;
    }

    //public void setSaldo(double saldo) {
    //    this.saldo = saldo;
    //}

    public String exibir() {
        return "conta: " + numero + " - saldo: " + saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

}
