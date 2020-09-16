package uri;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio,fim;
        inicio = 100;
        fim = 200;
        while(inicio<=fim){
            System.out.print(inicio + " ");
            inicio++;
        }
        in.close();
    }
}
