package aula06.exercicioConta;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do{
    
        System.out.println("1-Criar Conta Corrente.");
        System.out.println("2-Criar Conta Corrente.");
        System.out.println("3-Criar Conta Corrente.");
        System.out.println("4-Depositar.");
        System.out.println("5-Sacar.");
        System.out.println("6-Sair.");
        System.out.print("--->");
        opcao = in.nextIn();

        switch (opcao) {
            case 1:
            System.out.println("Criando Conta Corrente.");
                break;
                case 2:
                System.out.println("Criando Conta Especial.");
                    break;
            default:
            System.out.println("Opcao invalida");
                break;
        }

        } while opcao!= 6
    }
}
