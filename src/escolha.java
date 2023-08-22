import java.util.HashMap;

public class escolha {
    private String opcao;
    private String txtEscolha;
    private capitulo proximo;
    private int Nproximo;
    private HashMap<Integer,capitulo> caps;

    public escolha(String txtEscolha, String opcao, int Nproximo, HashMap<Integer,capitulo> caps) {
        this.txtEscolha = txtEscolha;
        this.opcao = opcao;
        this.Nproximo = Nproximo;
        this.caps = caps;
    }

    public String getOpcao() {
        return this.opcao;
    }

    public String getTxtEscolha() {
        return this.txtEscolha;
    }

    public capitulo getProximo() {
        return this.proximo;
    }

    public void proxCap(){
        this.proximo = caps.get(Nproximo);
    }

}
