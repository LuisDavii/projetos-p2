import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class leitorDeArquivos {
    Scanner insira = new Scanner(System.in);

    public HashMap<String, personagem> lerPersonagens(String localArq) {
        HashMap<String, personagem> personagens = new HashMap<>();
        File arquivo = new File(localArq);
        try {
            Scanner escaneador = new Scanner(arquivo, "UTF-8");
            while (escaneador.hasNextLine()) {
                String linha = escaneador.nextLine();
                if (linha.equalsIgnoreCase("PERSONAGEM")) {
                    String id = escaneador.nextLine();
                    String nome = escaneador.nextLine();
                    int bravura = Integer.parseInt(escaneador.nextLine());
                    personagens.put(id, new personagem(nome, bravura));
                }
            }
            escaneador.close();
        } catch (IOException e) {
            System.out.println("arquivo não encontrado");
            e.printStackTrace();
        }

        return personagens;
    }

    public HashMap<Integer, capitulo> carregarCap(String localArq,HashMap<String, personagem> personagens) {
        HashMap<Integer, capitulo> capitulos = new HashMap<>();
        File arquivo = new File(localArq);
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
            while(escaneador.hasNextLine()){
                String linha = escaneador.nextLine();
                if(linha.equalsIgnoreCase("CAPITULO") || linha.equalsIgnoreCase("CAPITULO_IMG")){
                    int id = Integer.parseInt(escaneador.nextLine());
                    if(linha.equalsIgnoreCase("CAPITULO")){
                    capitulos.put(id,new capitulo(personagens,escaneador));
                    }
                    if(linha.equalsIgnoreCase("CAPITULO_IMG")){
                    capitulos.put(id,new capituloImagem(personagens, escaneador));
                    } 
                    if(escaneador.nextLine().equalsIgnoreCase("ESCOLHAS")){
                    escolha[] escolhasCap = new escolha[2];
                        for(int i=0;i<2;i++){
                        String opcao = escaneador.nextLine();
                        String txt = escaneador.nextLine();
                        int nDoCap = Integer.parseInt(escaneador.nextLine());
                        escolhasCap[i] = new escolha(txt, opcao, nDoCap, capitulos);
                        }
                        capitulos.get(id).setEscolhas(escolhasCap);
                    }
                }
                
            }
            escaneador.close();
        }
        catch(IOException e){
        System.out.println("arquivo não encontrado");
        e.printStackTrace();
        }
        return capitulos;
    }

}