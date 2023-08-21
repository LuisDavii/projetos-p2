
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class capitulo {
    Scanner insira = new Scanner(System.in);
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

    private void load(){
        try{
            FileWriter salva = new FileWriter("rsc/save.txt");
            salva.write("SAVE\n");
            salva.write(titulo);
            salva.write(principal.getNome());
            salva.close();
        }
        catch(IOException e){
            System.out.println(" não encontrado");
        }
    }

    public static void fim(){
        try{
            FileWriter salva = new FileWriter("rsc/save.txt");
            salva.write("");
            salva.close();
        }
        catch(IOException e){
            System.out.println("!!!");
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
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(velocidade);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
