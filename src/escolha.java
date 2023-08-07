public class escolha {
    private String opcao;
    private String txtEscolha;
    private capitulo proximo;

    public escolha(String txtEscolha, String opcao, capitulo proximo) {
        this.txtEscolha = txtEscolha;
        this.opcao = opcao;
        this.proximo = proximo;
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

}
