package uri;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String resultado;
        System.out.println("Informe um numero: ");
        n = in.nextInt();
        resultado = consultaPar(n);
        System.out.println("O número " + resultado);
        in.close();
    }

    static String consultaPar(int numero) {
        String resp;
        if (numero % 2 == 0) {
            resp = "é par";
        } else {
            resp = "nao é par";
        }
        return resp;
    }
}