package uri;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=1,soma=0,count=1;
        while(n!=0){
            System.out.printf("Digite o " + count + "º numero inteiro: ");
            n = in.nextInt();
            soma = soma + n;
            count++;
        }
        System.out.println("Soma: " + soma);
        in.close();
    }
}
