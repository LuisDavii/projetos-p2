public class texto {
    private String texto;
    private int mudaBravura_P;
    private int mudaBravura_S;

    public texto(String texto, int mudaBravura_P, int mudaBravura_S) {
        this.texto = texto;
        this.mudaBravura_P = mudaBravura_P;
        this.mudaBravura_S = mudaBravura_S;
    }


    public String getTexto() {
        return this.texto;
    }

    public int getMudaBravura_P() {
        return this.mudaBravura_P;
    }

    public int getMudaBravura_S() {
        return this.mudaBravura_S;
    }

}