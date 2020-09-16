package aula06.exercicioConta;

public class ContaPoupanca extends Conta {
    // atributos
    double taxa;

    // construtor
    public ContaPoupanca(int numero;double saldo){
        super(numero, saldo);
    }

    // metodos

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            super.sacar(valor - taxa);
        }

    }

}
