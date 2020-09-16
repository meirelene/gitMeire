package aula06.exercicioConta;

public class ContaCorrente extends Conta {
    // atributos
    
    // construtor
    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    // metodos
    
    @Override
    public void sacar(double valor){
        if(getSaldo()>=0&&getSaldo()>=valor){
            super.sacar(valor);
        }
        
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.10);
    }

}
