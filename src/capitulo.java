
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class capitulo {
    Scanner insira = new Scanner(System.in);
    private String titulo;
    private texto[] txt;
    private personagem principal;
    private personagem secundario;
    private escolha[] escolhas;
    protected Scanner escaneador;

    protected capitulo() {

    }

    public capitulo(String titulo, texto[] txt, personagem principal, personagem secundario) {
        this.titulo = titulo;
        this.principal = principal;
        this.txt = txt;
        this.secundario = secundario;
    }

    public capitulo(HashMap<String, personagem> personagens, Scanner escaneador) {
        this.escaneador = escaneador;
        lerCap(personagens, escaneador);

    }

    protected void lerCap(HashMap<String, personagem> personagens, Scanner escaneador) {
        this.titulo = escaneador.nextLine();
        String linha = escaneador.nextLine();
        this.principal = personagens.get("principal");
        this.secundario = null;
        if (linha != "n") {
            this.secundario = personagens.get(linha);
        }
        if (escaneador.nextLine().equalsIgnoreCase("HISTORIA")) {
            int quantidadeDeTxt = Integer.parseInt(escaneador.nextLine());
            this.txt = new texto[quantidadeDeTxt];
            for (int i = 0; i < quantidadeDeTxt; i++) {
                String Linha = escaneador.nextLine();//inicio_txt
                String Texto = "";
                Linha = escaneador.nextLine();
                    while(!Linha.equalsIgnoreCase("fim_txt")){
                    Texto= Texto+"\n"+Linha;
                    Linha= escaneador.nextLine();
                    }
                
                
                int energiaMudaP = Integer.parseInt(escaneador.nextLine());
                int energiaMudaS = Integer.parseInt(escaneador.nextLine());
                this.txt[i] = new texto(Texto, energiaMudaP, energiaMudaS);
            }
        }

    }

    protected void historia() {
        print(titulo, 20);
        principal.dizBravura();

        if (secundario != null) {
            secundario.dizBravura();
        }

        for (int i = 0; i < txt.length; i++) {
            print(txt[i].getTexto(), 10);
            principal.mudaBravura(txt[i].getMudaBravura_P());
            if (secundario != null) {
                secundario.mudaBravura(txt[i].getMudaBravura_S());
            }
        }

        if (escolhas != null) {
            for (int i = 0; i < escolhas.length; i++) {
                print(escolhas[i].getTxtEscolha(), 10);
            }
        }
    }

    private void escolha() {
        int n = 0;
        while (n == 0) {
            String resposta = insira.nextLine();
            for (int i = 0; i < escolhas.length; i++) {
                if (resposta.equalsIgnoreCase(escolhas[i].getOpcao())) {
                    escolhas[i].proxCap();
                    escolhas[i].getProximo().executa();
                    return;
                } else if (escolhas.length == i + 1) {

                }
            }
            print("Você não digitou uma opção válida, tente novamente!!", 20);
        }
    }

    public static void fim() {
        try {
            FileWriter salva = new FileWriter("rsc/save.txt");
            salva.write("");
            salva.close();
        } catch (IOException e) {
            System.out.println("!!!");
        }
    }

    public void executa() {
        this.historia();
        escolha();
    }

    public void setEscolhas(escolha[] escolha) {
        this.escolhas = escolha;
    }

    public static void print(String texto, int velocidade) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(velocidade);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
