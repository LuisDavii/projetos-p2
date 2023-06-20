import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        // introdução

        digitacao("  Riquezas ", 80);
        System.out.println("\n");

        digitacao("  Fama", 80);
        System.out.println("\n");

        digitacao("  Poder", 80);
        System.out.println("\n");

        digitacao("  Um homem conquistou tudo que o mundo tinha a oferecer, o Rei dos Piratas, Gold Roger." +
                "\nAntes de ser executado, suas últimas palavras levaram multidões aos mares: ", 30);
        System.out.println("");
       
        digitacao("- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''",
                40);
        System.out.println("");

        digitacao("E assim se iniciou a grande era dos piratas.", 30);

        // Nome
        System.out.println("\n");
        digitacao("Olá Aventureiro(a), como posso te chamar ? ", 60);
        String nome = insira.nextLine();

        // Capitulo I
        System.out.println("");
        digitacao("Capitulo I | A Escolha do Destino\n", 70);
        System.out.println("");

        digitacao("No Nort Blue, um(a) jovem chamado(a) " + nome + " se vê em um dilema." +
                "\nCriado(a) em uma vila pacífica, ele(a) sonha em se tornar um marinheiro(a) para proteger os outros. "
                +
                "\nMas a atração pelo desconhecido e a promessa de liberdade o(a) tentam a se juntar a um bando pirata.\n"
                +
                "Entre a responsabilidade e a aventura, " + nome + " precisa escolher seu caminho!!", 30);

        // primeira escolha
        System.out.println("\n" + "\n");

        digitacao("| Pirata | Em busca de tesouros e liberdade, embarque em aventuras\n" +
                "perigosas pelos mares desconhecidos, desafiando a ordem estabelecida e\n" +
                "enfrentando rivais implacáveis. O destino do One Piece aguarda por você!!", 15);

        System.out.println("\n" + "\n");

        digitacao("| Marinheiro | Defenda a justiça e a paz nos mares como um membro da Marinha.\n" +
                "Enfrente piratas perigosos, proteja os inocentes e lute contra a corrupção,\n" +
                "garantindo um mundo seguro para todos. Sua missão é a ordem e a proteção!!", 15);

        System.out.println("\n");

        digitacao("Escolha Seu Lado!!\n", 40);

        boolean opção1 = true;
        repeticao("pirata", "marinheiro",opção1);
        

        // Caso Pirata
        if(opção1){
            // Capitulo II | Lado Pirata 
            System.out.println("");
            digitacao("Capitulo II | A Jornada Começa !!", 70);
            System.out.println("\n");

            digitacao("Determinado(a),"+nome+" busca uma tripulação que aceite aprendizes em sua\n"+
            "jornada. Ele(a) se depara com Dois navios ancorados no porto:\nOs Piratas Rumbar ou Os Piratas Bellamy.", 30);
            System.out.println("\n");

            digitacao("| Rumbar | uma bando desconhecido cujo ninguém nunca ouviu falar",30);
            System.out.println("\n");

            digitacao("| Bellamy | Piratas infames cujo seus feitos ecoam pelos 4 mares", 30);
            System.out.println("\n");

            boolean bando1 = true;
            repeticao("rumbar", "bellamy",bando1);

            // Rumbar
            if(bando1){
                digitacao("Como um pirata novato, você se junta a uma pequena tripulação dos\n"+
            "Piratas Rumbar, liderada pelo audacioso Capitão Yorki. Sob a orientação\n"+
            "do Capitão Yorki, você aprende os segredos da vida pirata, desde a arte da\n"+
            "navegação até as habilidades de combate", 30);
            System.out.println("\n");

            digitacao("", 0);
            }

            // Bellamy
            else{
                digitacao("", 30);
            }

            
        }

        // Caso Marinheiro
        else{
            
        }
    }

































    
 
    //função p/efeito de digitação
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

    //função p/caso o usuario digite errado
    public static boolean repeticao(String opção1,String opção2,boolean caminho1){
        Scanner insira1 = new Scanner(System.in);
        
        boolean continua = true;

        while (continua){
            String escolha = insira1.nextLine();

            if (escolha.equalsIgnoreCase(opção1)) {
                continua = false;
            }
            else if (escolha.equalsIgnoreCase(opção2)) {
                continua = false;
                caminho1 = false;
            }
            else {
                digitacao("Você não digitou uma opção válida, tente novamente!!\n", 40);
                System.out.println("");
            }
        }
        return caminho1;
    }
}

