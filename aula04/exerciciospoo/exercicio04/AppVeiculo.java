package exerciciospoo.exercicio04;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("spin", "chevrolet", 9);
        Veiculo veiculo2 = new Veiculo("uno", "fiat", 12);

        System.out.println(veiculo1.exibirDados());
        System.out.println("Consumo: " + veiculo1.exibirConsumo() + " km/l");

        System.out.println(veiculo2.exibirDados());
        System.out.println("Consumo: " + veiculo2.exibirConsumo() + " km/l");
    }
}
