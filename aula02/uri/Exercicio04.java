package uri;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario, prestacao;
        System.out.print("Informe o salario bruto: R$ ");
        salario = in.nextFloat();
        System.out.print("Informe o valor da prestacao: R$ ");
        prestacao = in.nextFloat();
        if (prestacao > (salario * 0.30)) {
            System.out.println("Credito negado! Valor da prestacao ultrapassa 30% do salario.");
        } else {
            System.out.println("Credito concedido.");
        }
        in.close();
    }
}
