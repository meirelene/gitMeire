package uri;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "Programação em Java";
        livro1.autor = "Deitel";
        livro1.numPaginas = 437;

        System.out.println(livro1.exibirDados());
    }
}
