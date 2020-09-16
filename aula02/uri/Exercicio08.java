package uri;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        System.out.println("Informe 3 medidas: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        if ((a>b+c)||(b>a+c)) {
            System.out.println("As medidas não formam um triangulo.");
        }else {
            if ((a==b)&&(a==c)&&(b==c)){
                System.out.println("Triangulo equilatero.");
            }else {
                if ((a==b)||(b==c)||(a==c)) {
                System.out.println("Triangulo isosceles.");
                } else {
                    System.out.println("Triangulo escaleno.");
                }
            }
        }
    }
}
