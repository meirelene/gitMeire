package uri;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,count=1;
        System.out.print("Digite um numero: ");
        n = in.nextInt();
        System.out.print(count);
        while(count<=n){
            count = count * 2;
            System.out.printf(", " + count);
        }
        in.close();
        //logica errada corrigir
    }
}
