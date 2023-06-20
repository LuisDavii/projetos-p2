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
        System.out.println("\n");
       
        digitacao("- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''",
                40);
        System.out.println("\n");

        digitacao("E assim se iniciou a grande era dos piratas.", 30);

        // Nome
        System.out.println("\n");
        digitacao("Olá Aventureiro(a), como posso te chamar ? ", 60);
        String nome = insira.nextLine();
        String NOME = nome.toUpperCase();

        // Capitulo I
        System.out.println("");
        digitacao("Capitulo I | A Duvida Incessante\n", 70);
        System.out.println("");

        digitacao("Em um pequeno vilarejo no North Blue, vivia um(a) jovem chamado(a) " + nome + ".\n"+
                "Fascinado(a) pelas histórias de piratas, ele(a) sonhava em se juntar a uma\n"+
                "tripulação audaciosa e explorar os mares. Entretanto após diversas tentativas\n"+ 
                "e repetidos fracassos, "+nome+" começa a questionar seu sonho de se tornar um pirata\n"+
                "Ele(a) é atormentado por uma série de eventos desanimadores que minam sua\n"+
                "confiança e abalam sua determinação",30);

        // primeira escolha
        System.out.println("\n" + "\n");

        digitacao("| Tentar | Em busca de tesouros e liberdade, embarque em aventuras\n" +
                "perigosas pelos mares desconhecidos, desafiando a ordem estabelecida e\n" +
                "enfrentando rivais implacáveis. O destino do One Piece aguarda por você!!", 15);
        System.out.println("\n" + "\n");

        digitacao("| Desistir | O sol poente lança uma sombra melancólica sobre a pequena\n"+
                "vila onde vive "+nome+".", 15);
        System.out.println("\n");

        digitacao("Faça sua Escolha \n", 40);
        System.out.println("\n");

        boolean opção1 = true;
        repeticao("tentar", "desistir",opção1);
        

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
                System.out.println("\n");
                digitacao("Como um pirata novato, você se junta a uma pequena tripulação dos\n"+
            "Piratas Rumbar, liderada pelo audacioso Capitão Yorki. Sob a orientação\n"+
            "do Capitão Yorki, você aprende os segredos da vida pirata, desde a arte da\n"+
            "navegação até as habilidades de combate", 30);
            System.out.println("\n");

            digitacao("Após dois anos navegando com a tripulação dos Piratas Rumbar, "+nome+
            "\nconquistou a confiança de seu capitão.\n"+
            "Seu comprometimento, habilidades e lealdade ao bando eram incontestáveis.\n"+
            " \nCerto dia enquanto navegavam pela gran line em busca do one piece, os\n"+
            "Piratas Rumbar se depararam com uma visão aterrorizante: a tripulação do\n"+
            "temido Barba Negra se aproximava. Eles haviam cruzado o caminho com um\n"+
            "dos piratas mais perigosos e cruéis dos mares. Durante uma reunião no\n"+
            "navio, o Capitão Yorki olha diretamente nos seus olhos e faz uma pergunta", 30);
            System.out.println("\n");
        
            digitacao("- Cap. Yorki ''"+NOME+"!! Chegou a hora de tomarmos uma decisão séria.\n"+
            "Diante dessa tempestade , devemos lutar ou fugir e perecer como meros marujos?''", 30);
            System.out.println("\n");
            
            digitacao("- Cap. Yorki ''Decida "+NOME+", qual vai ser?'' ", 30);
            System.out.println("\n");


            digitacao("| Lutar | ", 70);
            System.out.println("\n");

            digitacao("| Fugir | ", 70);
            System.out.println("\n");


            boolean lutar = true;
            repeticao("lutar", "fugir", lutar);
            
            //Capitulo III | Lutar
                if(lutar){
                    System.out.println("\n");
                    digitacao("Capitulo III | Turbulência dos Mares: A Jornada de "+NOME, 70);
                    System.out.println("\n");
                    
                    digitacao("- "+nome+" ''Capitão, já enfrentamos muitos inimigos e derramamos sangue juntos\n"+
                            "Se a luta é necessária para proteger nossa tripulação e nossos objetivos,\n"+
                            "então devemos enfrentá-la sem hesitação. Não fugiremos do combate\n"+
                            "quando a honra e nossa liberdade estiverem em jogo!!''", 30);
                    System.out.println("\n");

                    digitacao("Chegou o dia em que o destino da tripulação tomou um rumo trágico.\n"+
                            nome+", estava pronto para provar seu valor no campo de batalha.\n"+
                            "Ao lado do capitão Yorki e dos companheiros de tripulação, ele erguia\n"+
                            "sua espada, ciente dos desafios que estavam por vir.\n"+
                            "\nNessa batalha, o navio foi destruído e muitos membros da tripulação\n"+
                            "perderam a vida. "+nome+", junto com Yorki e alguns outros sobreviventes,\n"+
                            "lutaram com todas as suas forças. O inimigo era implacável, e o número\n"+
                            "de oponentes era avassalador. Mesmo com cada fibra de seu ser gritando\n"+
                            "por vingança, "+nome+" percebeu que a morte de seu bando era inevitável.\n"+
                            "\nCom pesar, "+nome+ " olhou para os olhos de seus companheiros feridos, e a\n"+
                            "tristeza invadiu seu coração.\n"+
                            "- "+nome+" ''Precisamos fugir! Não há mais esperança aqui.''\n"+
                            "\nJuntos, eles correram para o navio destruído, desesperados por escapa\n"+
                            "daquela carnificina. Mas enquanto lutavam para abrir caminho entre os\n"+
                            "inimigos, um por um, os companheiros de "+NOME+" caíram. Seus gritos de dor\n"+
                            "e agonia ecoaram pelos ventos, misturados com o som das lâminas cortantes.\n", 30);
                    System.out.println("\n");

                    digitacao("Finalmente, restava apenas "+nome+". Sua mente estava turva com a dor e a\n"+
                            "perda, mas ele sabia que tinha que sobreviver. Cada celula de seu corpo\n"+
                            "clamava por vingança, mas ele se obrigou a seguir em frente, lutando com\n"+
                            "as últimas gotas de energia que lhe restavam.\n"+
                            "\nCom lágrimas em seus olhos, nome conseguiu escapar daquele pesadelo.\n"+
                            "Sozinho, ele passou o resto da sua vida infima vagando pelos mares,\n"+
                            "consumido pela culpa e pela tristeza por ter sido o único a sobreviver.\n", 45);
                    System.out.println("\n");

                    digitacao("|  F I M  |", 70);
                }
                //não lutar
                else{

                }
            
            }
            // Bellamy
            else{
                digitacao("", 30);
            }

            
            
        }
        // Caso Desista
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

