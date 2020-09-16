package uri;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha;
        senha = in.nextLine();
        if(senha.equals("R10p5")){
            System.out.println("Acesso concedido!");
        }
        else{
            System.out.println("Senha inválida. Acesso negado!");
        }
    in.close();
    }
}
