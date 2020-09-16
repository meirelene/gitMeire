package exerciciospoo.exercicio04;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo(String modelo, String marca, float consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    String exibirDados() {
        return "Modelo: " + modelo + " - " + "Marca: " + marca;
    }

    double exibirConsumo() {
        return consumo;
    }
}
