import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,media;
        
        // Entrada de dados
        System.out.print("Informe a primeira nota = ");
        nota1 = entrada.nextFloat();
        System.out.print("Informa a segudna nota = ");
        nota2 = entrada.nextFloat();
        
        // Entrada de dados
        media = (nota1 + nota2) / 2;

        // Saída da resposta
        System.out.println("A média é = " + media);

        entrada.close();
    }
}
