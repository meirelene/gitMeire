package uri;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,count;
        System.out.print("Informe um número inteiro de 1 a 9: ");
        n = in.nextInt();
        count = 0;
        while(count<=10){
            System.out.println(n + " X " + count + " = " + n*count);
            count++;
        }
        in.close();
    }
}
