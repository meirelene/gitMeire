public class Relogio {
    private int hora, minuto, segundo;

    // contrutor
    Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > -1 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > -1 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > -1 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public String exibirHora() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public void avancarHora() {
        if (segundo < 59) {
            segundo++;
        } else {
            segundo = 0;
            if (minuto < 59) {
                minuto++;
            } else {
                minuto = 0;
                if (hora < 23) {
                    hora++;
                } else {
                    hora = 0;
                    segundo = 1;
                }
            }
        }
    }
}