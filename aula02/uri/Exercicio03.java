package uri;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1,n2;
        // ler dois numeros flutuantes e apresentar em ordem nao crescente
        System.out.println("Informe primeiro numero: ");
        n1 = in.nextFloat();
        System.out.println("Informe segundo numero: ");
        n2 = in.nextFloat();
        if (n1>n2){
            System.out.println("Ordem decrescente: " + n1 + " " + n2);
        }
        else {
            System.out.println("Ordem decrescente: " + n2 + " " + n1);
        }
        in.close();
    }
}
