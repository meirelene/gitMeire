import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,altura,area;

        // Entrada de dados
        System.out.print("Informe a medida da base do triângulo: ");
        base = entrada.nextDouble();
        System.out.print("Informe a medida da altura do triângulo: ");
        altura = entrada.nextDouble();

        // Processamento de dados
        area = (altura * base / 2);

        // Saída de dados
        System.out.print("Área do triângulo: " + area);
        
        entrada.close();
    }
}
