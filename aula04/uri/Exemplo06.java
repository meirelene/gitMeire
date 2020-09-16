package uri;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        linha(10);
        System.out.println("Inicio do programa");
        linha(20);
        //linha2 (20, *)
        //linha2(20, escolha);
        //incompleto
    }

    //metodo linha nao tem retorno
    static void linha(int tamanho){
        for(i=0;i<tamanho;i++){
            System.out.println("-");
        }
        System.out.println();
    }
}
