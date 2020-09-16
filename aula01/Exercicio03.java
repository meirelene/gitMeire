import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioAtual,salarioNovo;

        // Entrada de dados
        System.out.println("Informe o salário atual: ");
        salarioAtual = entrada.nextDouble();

        // Processamento de dados
        salarioNovo = salarioAtual + (salarioAtual * 0.25);
        
        // Saída da resposta
        System.out.println("Novo salário com aumento de 25%: " + salarioNovo);

        entrada.close();

    }
}
