package uri;

import java.util.Scanner;

public class Exerc1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // int codigoPeca1,codigoPeca2;
        int numeroPeca1,numeroPeca2;
    
        double valorPeca1,valorPeca2,soma;

        entrada.nextInt();
        numeroPeca1 = entrada.nextInt();
        valorPeca1 = entrada.nextDouble();
        entrada.nextInt();
        numeroPeca2 = entrada.nextInt();
        valorPeca2 = entrada.nextDouble();

        soma = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

        entrada.close();
    }
}
