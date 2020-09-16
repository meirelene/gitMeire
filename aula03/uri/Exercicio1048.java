package uri;

import java.util.Scanner;

public class Exercicio1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioAtual,salarioNovo,valorReajuste,indiceReajuste;
        System.out.print("Informe o salario atual: ");
        salarioAtual = in.nextDouble();
        if(salarioAtual>2000){
            salarioNovo = salarioAtual * 1.4;
            valorReajuste = salarioNovo - salarioAtual;
            indiceReajuste = 4;
            System.out.println("Novo salario: R$ " + salarioNovo);
            System.out.println("Valor do reajuste: R$ " + valorReajuste);
            System.out.println("Indice do reajuste: " + indiceReajuste + "%");
        } else {
            if(salarioAtual>1200){
                salarioNovo = salarioAtual * 1.7;
                valorReajuste = salarioNovo - salarioAtual;
                indiceReajuste = 7;
                System.out.println("Novo salario: R$ " + salarioNovo);
                System.out.println("Valor do reajuste: R$ " + valorReajuste);
                System.out.println("Indice do reajuste: " + indiceReajuste + "%");
            } else {
            if(salarioAtual>800){
                salarioNovo = salarioAtual * 1.10;
                valorReajuste = salarioNovo - salarioAtual;
                indiceReajuste = 10;
                System.out.println("Novo salario: R$ " + salarioNovo);
                System.out.println("Valor do reajuste: R$ " + valorReajuste);
                System.out.println("Indice do reajuste: " + indiceReajuste + "%");
            } else {
                if(salarioAtual>400){
                    salarioNovo = salarioAtual * 1.12;
                    valorReajuste = salarioNovo - salarioAtual;
                    indiceReajuste = 12;
                    System.out.println("Novo salario: R$ " + salarioNovo);
                    System.out.println("Valor do reajuste: R$ " + valorReajuste);
                    System.out.println("Indice do reajuste: " + indiceReajuste + "%");
                } else {
                    salarioNovo = salarioAtual * 1.15;
                    valorReajuste = salarioNovo - salarioAtual;
                    indiceReajuste = 15;
                    System.out.println("Novo salario: R$ " + salarioNovo);
                    System.out.println("Valor do reajuste: R$ " + valorReajuste);
                    System.out.println("Indice do reajuste: " + indiceReajuste + "%");
                }
            }
        }
        in.close();
    }
}
