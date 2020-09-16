package uri;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario;
        System.out.print("Informe o salario: ");
        salario = in.nextFloat();
        if (salario <= 600) {
            System.out.println("Desconto INSS: Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto INSS - 20%: " + salario * 0.2);
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto INSS - 25%: " + salario * 0.25);
                } else
                    System.out.println("Desconto INSS - 30%: " + salario * 0.3);
            }
        }
    }
}
