package aula06.exercicioFuncionario;

import jdk.nashorn.api.tree.FunctionDeclarationTree;
import jdk.nashorn.internal.runtime.FunctionInitializer;

public class AppFuncionario {
 public static void main(String[] args) {
     Funcionario f1 = new Funcionario("Ana Rita", 5000);
     Gerente g1 = new Gerente("Landry",10000,10);

     System.out.println(f1.imprimir());
     System.out.println(g1.imprimir());

     f1.aumentarSalario(0.1);
     g1.aumentarSalario(0.1);

     System.out.println(f1.imprimir());
     System.out.println(g1.imprimir());
 }   
}
