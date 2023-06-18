import java.util.Scanner;

public class App {
    public static void main(String[] args){
         Scanner insira = new Scanner(System.in);

         //introdução

         digitacao("- Riqueza ",50);
         System.out.println("\n");

         digitacao("- Fama",50);
         System.out.println("\n");

         digitacao("- Poder",50);
         System.out.println("\n");

         digitacao("- O homem que conseguiu tudo neste mundo, o Rei dos Piratas, Gold Roger.\n", 50);
         digitacao("Suas últimas palavras antes de ser executado, foram enviadas para todos no mar.\n",50);
         digitacao("- Gold roger  'Minhas riquezas e tesouros? Se vocês quiserem, eu os deixo pegar.'\n",50);
         digitacao("e assim se iniciou a grande era dos piratas",50);
    



    }


























    //funções utilizadas
 
    public static void digitacao(String texto, int velocidade) {
        // "texto.length" pra saber o tamanho da string e percorrê la, e imprimir letra por letra
        for (int i = 0; i < texto.length(); i++) {

        // "texto.charAt" pra pegar determinada caractere do texto e logo em seguida imprimir
            System.out.print(texto.charAt(i));
            //"try" e "catch" pra tratamento de exeções
            try {
                //Thread.sleep() pra fazer o programa esperar determinado tempo
                Thread.sleep(velocidade);
            }   
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


    
