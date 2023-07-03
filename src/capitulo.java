import java.util.Scanner;

public class capitulo {
     Scanner insira = new Scanner(System.in);
     String titulo, txt, apreOpc1, apreOpc2;
     personagem principal;
     personagem secundario;
     int mudaQnt;

    capitulo(String titulo, String txt, personagem principal, personagem secundario){
         this.titulo = titulo;
         this.principal = principal;
         this.txt = txt;
         this.secundario = secundario;
     }


    public void historia(){
         digitacao(titulo, 70);
         principal.dizBravura();
         if(secundario != null){
             secundario.dizBravura();
             }
         digitacao(txt, 15);
    }

    void txtOpcoes(String apreOpc1, String apreOpc2){
        this.apreOpc1 = apreOpc1; 
        this.apreOpc2 = apreOpc2;
    }
    
    boolean escolha(String opc1, String opc2) {
        digitacao(apreOpc1, 15);
        digitacao(apreOpc2, 15);
        boolean continua = true;
        boolean primeiro = true;

        while (continua) {
            
            String escolha = insira.nextLine();
            if (escolha.equalsIgnoreCase(opc1)) {
                continua = false;

            } else if (escolha.equalsIgnoreCase(opc2)) {
                continua = false;
                primeiro = false;
            } else {
                digitacao("Você não digitou uma opção válida, tente novamente!!", 40);
            }
        
        }
        return primeiro;
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
