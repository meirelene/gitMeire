package uri;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota1,nota2, mediaAluno, mediaClasse;

        for (i = 0; i < 5; i++) {
            
                do {
                    System.out.print("Informe a nota 1: ");
                    nota1 = in.nextInt();
                    
                } while((nota1>=0)&&(nota1<=10));
                
                do {
                    System.out.print("Informe a nota 2: ");
                    nota2 = in.nextInt();
                } while (nota2>=0)&&(nota2<=10);
            }   

        }

        // incompleto - terminar

    // ler duas notas de 5 alunos - calcular media cada aluno e da classe
    // validar entrar nota de 0 a 10 - caso contrario solicita de novo
    // usar do while pra validar a nota

    /*
     * do{ System.out.println("Digite um valor positivo:"); valor = in.nextInt();
     * }while(valor <= 0);
     */
}}
