package uri;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3, retorno;
        System.out.printf("Informe o primeiro numero: ");
        n1 = in.nextInt();
        System.out.printf("Informe o segundo numero: ");
        n2 = in.nextInt();
        System.out.printf("Informe o terceiro numero: ");
        n3 = in.nextInt();
        retorno = ehMenor(n1, n2, n3);
        System.out.println("O menor numero é " + retorno);
        in.close();
    }

    public static int ehMenor(int x1, int x2, int x3) {
        int resp;
        if ((x1 < x2) && (x1 < x3)) {
            resp = x1;
        } else {
            if ((x2 < x3) && (x2 < x1)) {
                resp = x2;
            } else {
                {
                    resp = x3;
                }
            }
        }
        return resp;
    }
}
