import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
         Scanner insira = new Scanner(System.in);

         //introdução

         digitacao("  Riquezas ",50);
         System.out.println("\n");

         digitacao("  Fama",50);
         System.out.println("\n");

         digitacao("  Poder",50);
         System.out.println("\n");

         digitacao("  Um homem conquistou tudo que o mundo tinha a oferecer, o Rei dos Piratas, Gold Roger."+
         "\nAntes de ser executado, suas últimas palavras levaram multidões aos mares: \n",40);
         System.out.println("");
         digitacao("- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''\n",50);
         System.out.println("");
         digitacao("E assim se iniciou a grande era dos piratas.",50);
    
         //Nome
         System.out.println("\n");
         digitacao("Olá Aventureiro(a), como posso te chamar ? ",50);
         String nome = insira.nextLine();
         
         //Capitulo I
         System.out.println("");
         digitacao("Capitulo I | A Escolha do Destino\n",70);
         System.out.println("");

         digitacao("No Nort Blue, um(a) jovem chamado(a) "+nome+" se vê em um dilema."+
         "\nCriado(a) em uma vila pacífica, ele(a) sonha em se tornar um marinheiro(a) para proteger os outros. "+
         "\nMas a atração pelo desconhecido e a promessa de liberdade o(a) tentam a se juntar a um bando pirata.\n"+
         "Entre a responsabilidade e a aventura, "+nome+" precisa escolher seu caminho!!", 40); 
        
         //primeira escolha
         System.out.println("\n"+"\n");

         digitacao("| Pirata | Em busca de tesouros e liberdade, embarque em aventuras\n"+
         "perigosas pelos mares desconhecidos, desafiando a ordem estabelecida e\n"+
         "enfrentando rivais implacáveis. O destino do One Piece aguarda por você!!", 30);

         System.out.println("\n"+"\n");

         digitacao("| Marinheiro | Defenda a justiça e a paz nos mares como um membro da Marinha.\n"+
         "Enfrente piratas perigosos, proteja os inocentes e lute contra a corrupção,\n"+
         "garantindo um mundo seguro para todos. Sua missão é a ordem e a proteção!!", 30);

         String escolha = insira.nextLine();

         if(escolha.equalsIgnoreCase("piratas")){
             digitacao("", 40);
         }
         else{

         }



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


    
