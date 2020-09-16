package aula06.exercicioFuncionario;

import jdk.nashorn.internal.ir.SetSplitState;
import jdk.nashorn.internal.runtime.FunctionScope;

public class Gerente extends nFuncionarios {
    private int nFuncionarios;

    // construtor
    public Gerente(String nome, double salario, int nFuncionarios) {
    super(String nome,double salario);
    this.nFuncionarios = nFuncionarios;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + " : " + nFuncionarios;
    }

    @Override
    public void aumentarSalario() {
        double bonus = getSalario() * 0.2;
        super.aumentarSalario(perc);
        SetSalario(getsalario() + bonus);

    }
}
