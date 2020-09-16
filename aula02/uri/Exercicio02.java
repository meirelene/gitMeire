package uri;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1,nota2,media;
        System.out.printf("Digita a nota 1: ");
        nota1 = in.nextDouble();
        System.out.printf("Digita a nota 2: ");
        nota2 = in.nextDouble();
        media = (nota1 * 4 + nota2 * 6)/10;
        if (media>=6.0) {
            System.out.printf("Aprovado - media: %.2f", media);
        }
            else {
                System.out.printf("Reprovado - media: %.2f", media);
            }
        in.close();
    }
}
