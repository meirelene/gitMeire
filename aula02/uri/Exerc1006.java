package uri;

import java.util.Scanner;

public class Exerc1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A,B,C,soma,media;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        
        soma = 2 * A + 3 * B + 5 * C;
        media = soma / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();
    }
}
