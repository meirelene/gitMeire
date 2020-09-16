public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(8, 59, 56);
        Relogio relogio2 = new Relogio(18, 30, 11);
        Relogio relogio3 = new Relogio(9, 30, 10);

        System.out.println(relogio1.exibirHora());
        System.out.println(relogio2.exibirHora());
        System.out.println(relogio3.exibirHora());

        for (int i = 0; i < 10; i++) {
            relogio1.avancarHora();
            System.out.println(relogio1.exibirHora());
        }

    }
}
