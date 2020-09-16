public class Funcionario {
    private String nome;
    private double salario;

    // construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String imprimir() {
        return nome + " : " + salario;
    }

    public void aumentarSalario(double perc){
        salario += salario * perc;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario>this.salario){
            this.salario = salario;
        }
    }
}