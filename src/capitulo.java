import java.util.Scanner;

public class capitulo {
     Scanner insira = new Scanner(System.in);
     String titulo, txt, txtOpc1, txtOpc2;
     personagem principal;
     personagem secundario;
     int mudaQnt;
     String[] escolhasTxt = new String[2];

    capitulo(String titulo, String txt, personagem principal, personagem secundario, String[] esolhasTxt){
         this.titulo = titulo;
         this.principal = principal;
         this.txt = txt;
         this.secundario = secundario;
         this.escolhasTxt = esolhasTxt;
     }


    public void historia(){
         digitacao(titulo, 70);
         principal.dizBravura();
         if(secundario != null){
             secundario.dizBravura();
             }
         digitacao(txt, 15);
         if(escolhasTxt != null){
            for(int i = 0; i < escolhasTxt.length ; i++){
                digitacao(escolhasTxt[i], 20);
            }
         }
    }

    
    
    String escolha(String[] escolhasTxt ,String opc1, String opc2) {
        if(escolhasTxt != null){
            for(int i = 0; i < escolhasTxt.length ; i++){
                digitacao(escolhasTxt[i], 20);
            }}
        boolean continua = true;
        
        int i = 0;
        while (continua) {
            
            String escolha = insira.nextLine();
            if (escolha.equalsIgnoreCase(opc1)) {
                continua = false;
                i = 0;

            } else if (escolha.equalsIgnoreCase(opc2)) {
                continua = false;
                i = 1;
            } else {
                digitacao("Você não digitou uma opção válida, tente novamente!!", 40);
            }
        
        }
        return escolhasTxt[i];      
    } 

    void mudaBravura(int mudaQnt, personagem qPersonagem){ 
        qPersonagem.mudaBravura(mudaQnt);
    }
          
    void soTxt(String txt2){
        digitacao(txt2, 30);
    }
              
    void fim(){
        digitacao("|  F I M  |", 70);
    }
    

























    public static void digitacao(String texto, int velocidade) {
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
