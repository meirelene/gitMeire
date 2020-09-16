package uri;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        float x;
        n = in.nextInt();
        if (n > 20) {
            x = n / 2;
            System.out.println("Metade = " + x);
        }
        in.close();
    }
}
