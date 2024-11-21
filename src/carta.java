public class carta {
    private String palo;
    private String valor;
    private int puntos;

    public carta(String palo, String valor, int puntos) {
        this.palo = palo;
        this.valor = valor;
        this.puntos = puntos;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
