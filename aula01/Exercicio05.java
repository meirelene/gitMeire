import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double km,pes,polegadas,jardas,milhas;

        // Entrada de dados
        System.out.print("Informe a distância em KM: ");
        km = entrada.nextDouble();

        // Processamento de dados
        milhas = km * 0.62137;
        jardas = milhas * 1760;
        pes = jardas * 3;
        polegadas = pes * 12;

        // Saída de dados
        System.out.println("Medida em pés: " + pes);
        System.out.println("Medida em polegadas: " + polegadas);
        System.out.println("Medida em jardas: " + jardas);
        System.out.println("Medida em milhas: " + milhas);

        entrada.close();
    }
}
