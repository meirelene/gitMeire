package aula06.exercicioConta;

public class ContaEspecial extends Conta {
    // atributos
    private double limite;

    // construtor
    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    // metodos

    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            super.sacar(valor);
        }

    }
}
