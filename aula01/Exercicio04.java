import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo,quilowatts,valorQuilowatts,valorResidencia,valorDesconto;

        // Entrada de dados
        System.out.print("Informe o valor do salario mínimo: R$ ");
        salarioMinimo = entrada.nextDouble();
        System.out.print("Informe a quantidade de quilowatts consumida: ");
        quilowatts = entrada.nextDouble();

        // Processamento de dados
        valorQuilowatts = salarioMinimo / 500;
        valorResidencia = quilowatts * valorQuilowatts;
        valorDesconto = valorResidencia - valorResidencia * 0.15;

        // Saída de dados
        System.out.println("Valor do quilowatt: R$ " + valorQuilowatts);
        System.out.println("Valor a ser pago pela residência: R$ " + valorResidencia);
        System.out.println("Valor com 15% de desconto: R$ " + valorDesconto);

        entrada.close();
    }
}
