package uri;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, count = 1, par = 0, impar = 0;
        while (count <= 10) {
            System.out.printf("Informe o " + count + "º " + "numero: ");
            n = in.nextInt();
            count++;
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Pares" + par);
        System.out.println("Impares" + impar);
        in.close();

    }
}
