import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class leitorDeArquivos{
    Scanner insira = new Scanner(System.in);


    public HashMap<String, personagem> lerPersonagens(String localArq) {
        HashMap<String, personagem> personagens = new HashMap<>();
        File arquivo = new File(localArq);
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
            while(escaneador.hasNextLine()){
                String linha = escaneador.nextLine();
                if(linha.equalsIgnoreCase("PERSONAGEM")){
                    String id = escaneador.nextLine();
                    String nome = escaneador.nextLine();
                    int bravura = Integer.parseInt(escaneador.nextLine());
                    personagens.put(id,new personagem(nome,bravura));
                }
            }
            escaneador.close();
        }
        catch(IOException e){
            System.out.println("arquivo não encontrado");
            e.printStackTrace();
        }
        
        return personagens;
    }




    public HashMap<Integer, capitulo> lerCap(String localArq,HashMap<String, personagem> personagens) {
        HashMap<Integer, capitulo> capitulos = new HashMap<>();
        File arquivo = new File(localArq);
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
            while(escaneador.hasNextLine()){
                 String linha = escaneador.nextLine();
                if(linha.equalsIgnoreCase("CAPITULO")){
                    int id = Integer.parseInt(escaneador.nextLine());
                    String titulo = escaneador.nextLine();
                    linha = escaneador.nextLine();
                    personagem secundario = null;
                    if (linha!="n"){
                    secundario = personagens.get(linha);
                    }
                    texto[] txtCap = null;
                    if(escaneador.nextLine().equalsIgnoreCase("HISTORIA")){
                        int quantidadeDeTxt = Integer.parseInt(escaneador.nextLine());
                        txtCap = new texto[quantidadeDeTxt];
                        for(int i=0;i<quantidadeDeTxt;i++){
                            String proxLinha = escaneador.nextLine();
                            int energiaMudaP = Integer.parseInt(escaneador.nextLine());
                            int energiaMudaS = Integer.parseInt(escaneador.nextLine());
                            txtCap[i] = new texto(proxLinha, energiaMudaP, energiaMudaS);
                        }
                    }
                    capitulos.put(id,new capitulo(titulo, txtCap, personagens.get("principal"), secundario));

                    if(escaneador.nextLine().equalsIgnoreCase("ESCOLHAS")){
                       escolha[] escolhasCap = new escolha[2];
                       for(int i=0;i<2;i++){
                         String opcao = escaneador.nextLine();
                         String txt = escaneador.nextLine();
                         int nDoCap = Integer.parseInt(escaneador.nextLine());
                         if(!(capitulos.containsKey(nDoCap))){
                            capitulos.put(nDoCap, new capitulo(null, null, null, null));
                         }
                         capitulo proxCap = capitulos.get(nDoCap);
                         escolhasCap[i] = new escolha(txt, opcao, proxCap);
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


    




    public HashMap<String, personagem> lerSave() {
        HashMap<String, personagem> personagens = new HashMap<>();
        File arquivo = new File("rsc/save.txt");
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
            while(escaneador.hasNextLine()){
                String linha = escaneador.nextLine();
                if(linha.equalsIgnoreCase("SAVE")){
                    capitulo.print("Deseja continuar da onde parou? 'S'|'N'", 20);
                    String resposta = insira.nextLine();
                    if(resposta.equalsIgnoreCase("s")){
                        int nUltimoCap = Integer.parseInt(escaneador.nextLine());
                        String Principal = escaneador.nextLine();
                        personagens.put("principal",new personagem(Principal,100));
                        escaneador.close();
                        return personagens;
                    }
                    else if(resposta.equalsIgnoreCase("n")){
                        escaneador.close();
                        return personagens;
                    }
                    else{
                    capitulo.print("Digite uma Opção Válida!!", 0);
                    }
                }
            }
            capitulo.print("Nenhum save foi encontrado!", 40);
            escaneador.close();
        }
        catch(FileNotFoundException e){
            System.out.println("arquivo não encontrado");
        }
        return personagens;
    }


}