package uri;

import java.util.Scanner;

public class Exercicio1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        //A seguir, se B>C e se D>A, e a C+D>A+B e se C>0 e D>0 (ambos positivos) e se A=par escrever "Valores aceitos", senão escrever "Valores nao aceitos".
        //System.out.println("Informe 4 valores inteiros: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        if((b>c)&&(d>a)&&(c+d>a+b)&&(c>0)&&(d>0)&&(a%2==0)){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        in.close();
    }
}
