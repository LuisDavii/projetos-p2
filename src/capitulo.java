import java.util.Scanner;

public class capitulo {
    private Scanner insira = new Scanner(System.in);
    private String titulo;
    private texto[] txt;
    private personagem principal;
    private personagem secundario;
    private escolha[] escolhas;

    public capitulo(String titulo, texto[] txt, personagem principal, personagem secundario) {
        this.titulo = titulo;
        this.principal = principal;
        this.txt = txt;
        this.secundario = secundario;
    }

    public void historia() {
        print(titulo, 70);
        principal.dizBravura();

        if (secundario != null) {
            secundario.dizBravura();
        }

        for (int i = 0; i < txt.length; i++) {
            print(txt[i].getTexto(), 20);
            principal.mudaBravura(txt[i].getMudaBravura_P());
            if (secundario != null) {
                secundario.mudaBravura(txt[i].getMudaBravura_S());
            }
        }

        if (escolhas != null) {
            for (int i = 0; i < escolhas.length; i++) {
                print(escolhas[i].getTxtEscolha(), 20);
            }
        }
    }

    private void escolha() {
        int n = 0;
        while (n == 0) {
            String resposta = insira.nextLine();
            for (int i = 0; i < escolhas.length; i++) {
                if (resposta.equalsIgnoreCase(escolhas[i].getOpcao())) {
                    escolhas[i].getProximo().executa();
                    return;
                } else if (escolhas.length == i + 1) {

                }
            }

            print("Você não digitou uma opção válida, tente novamente!!", 40);
        }
    }

    public void executa() {
        historia();
        escolha();
    }

    public void setEscolhas(escolha[] escolha) {
        this.escolhas = escolha;
    }

    public static void print(String texto, int velocidade) {
        // "texto.length" pra saber o tamanho da string e percorrê la, e imprimir letra
        // por letra
        for (int i = 0; i < texto.length(); i++) {

            // "texto.charAt" pra pegar determinada caractere do texto e logo em seguida
            // imprimir
            System.out.print(texto.charAt(i));
            // "try" e "catch" pra tratamento de exeções
            try {
                // Thread.sleep() pra fazer o programa esperar determinado tempo
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
