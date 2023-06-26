import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        // introdução

        digitacao("  Riquezas ", 50);
        
        digitacao("  Fama", 50);
        
        digitacao("  Poder", 50);
        
        digitacao("  Um homem conquistou tudo que o mundo tinha a oferecer, o Rei dos Piratas, Gold Roger." +
                "\nAntes de ser executado, suas últimas palavras levaram multidões aos mares: ", 20);
        
        digitacao("- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''",
                40);
        
        digitacao("E assim se iniciou a grande era dos piratas.", 20);

        // Nome
        
        digitacao("Olá Aventureiro(a), como posso te chamar ? ", 40);
        
        personagem principal = new personagem(insira.nextLine());

        // Capitulo I
        System.out.println("");
        digitacao("Capitulo I | A Duvida Incessante", 70);
        
        principal.dizBravura();

        digitacao("Em um pequeno vilarejo no North Blue, vivia um(a) jovem chamado(a) " + principal.Nome() + ".\n"+
                "Fascinado(a) pelas histórias de piratas, ele(a) sonhava em se juntar a uma\n"+
                "tripulação audaciosa e explorar os mares. Entretanto após diversas tentativas\n"+ 
                "e repetidos fracassos, "+principal.Nome()+" começa a questionar seu sonho de se tornar um pirata\n"+
                "Ele(a) é atormentado por uma série de eventos desanimadores que minam sua\n"+
                "confiança e abalam sua determinação",25);

        // primeira escolha
    
        digitacao("| Tentar | Em busca de tesouros e liberdade, embarque em aventuras\n" +
                "perigosas pelos mares desconhecidos, desafiando a ordem estabelecida e\n" +
                "enfrentando rivais implacáveis. O destino do One Piece aguarda por você!!", 15);

        digitacao("| Desistir | O sol poente lança uma sombra melancólica sobre a pequena\n"+
                "vila onde vive "+principal.Nome()+".", 15);
        
        digitacao("Faça sua Escolha", 40);

        // Caso tentar
        if(repeticao("tentar", "desistir")){
            // Capitulo II | Lado Pirata 
            
            digitacao("Capitulo II | A Jornada Começa !!", 70);
            principal.dizBravura();

            digitacao("Determinado(a),"+principal.Nome()+" busca uma tripulação que aceite aprendizes em sua\n"+
            "jornada. Ele(a) se depara com Dois navios ancorados no porto:\nUm navio dos Piratas Rumbar"+
            " e outro da tripulação dos Piratas Bellamy.", 20);

            digitacao("| Rumbar | uma bando desconhecido cujo ninguém nunca ouviu falar",20);
            
            digitacao("| Bellamy | Piratas infames cujo seus feitos ecoam pelos 4 mares", 20);
            
            // Rumbar
            if(repeticao("rumbar", "bellamy")){
                
                digitacao("Como um pirata novato, você se junta a uma pequena tripulação dos\n"+
                    "Piratas Rumbar, liderada pelo audacioso Capitão Yorki.",20);
            
                personagem yorki = new personagem("Yorki");    
                yorki.dizBravura();

                digitacao("Sob a orientação do Capitão Yorki, você aprende os segredos da vida pirata,"+
                 "desde a arte da navegação até as habilidades de combate", 20);
            
                digitacao("Após dois anos navegando com a tripulação dos Piratas Rumbar, "+principal.Nome()+
                 "\nconquistou a confiança de seu capitão.",20);
                principal.ganhaBravura(20);

                 digitacao("Seu comprometimento, habilidades e lealdade ao bando eram incontestáveis.\n"+
                 "\nCerto dia enquanto navegavam pela gran line em busca do one piece, os\n"+
                 "Piratas Rumbar se depararam com uma visão aterrorizante: a tripulação do\n"+
                 "temido Vegapunk se aproximava. Eles haviam cruzado o caminho com um\n"+
                 "dos piratas mais perigosos e cruéis dos mares. Durante uma reunião no\n"+
                 "navio, o Capitão Yorki olha diretamente nos seus olhos e faz uma pergunta", 20);
            
            digitacao("- Cap. Yorki ''"+(principal.Nome()).toUpperCase()+"!! Chegou a hora de tomarmos uma decisão séria.\n"+
            "Diante dessa tempestade , devemos lutar ou fugir e perecer como meros marujos?''", 20);
            
            digitacao("- Cap. Yorki ''Decida "+(principal.Nome()).toLowerCase()+", qual vai ser?'' ", 20);
            
            digitacao("| Lutar | ", 70);
            
            digitacao("| Fugir | ", 70);
            
            //Capitulo III | Lutar
                if(repeticao("lutar", "fugir")){
                    
                    digitacao("Capitulo III | Turbulência dos Mares: A Jornada de "+principal.Nome(), 70);
                    principal.dizBravura();
                    yorki.dizBravura();

                    digitacao("- "+principal.Nome()+" ''Capitão, já enfrentamos muitos inimigos e derramamos sangue juntos\n"+
                            "Se a luta é necessária para proteger nossa tripulação e nossos objetivos,\n"+
                            "então devemos enfrentá-la sem hesitação. Não fugiremos do combate\n"+
                            "quando a honra e nossa liberdade estiverem em jogo!!''", 20);
                    principal.ganhaBravura(20);

                    digitacao("Chegou o dia em que o destino da tripulação tomou um rumo trágico.\n"+
                            principal.Nome()+", estava pronto para provar seu valor no campo de batalha.\n"+
                            "Ao lado do capitão Yorki e dos companheiros de tripulação, ele erguia\n"+
                            "sua espada, ciente dos desafios que estavam por vir.\n"+
                            "\nNessa batalha, o navio foi destruído e muitos membros da tripulação\n"+
                            "perderam a vida. "+principal.Nome()+", junto com Yorki e alguns outros sobreviventes,\n"+
                            "lutaram com todas as suas forças. O inimigo era implacável, e o número\n"+
                            "de oponentes era avassalador. Mesmo com cada fibra de seu ser gritando\n"+
                            "por vingança, "+principal.Nome()+" percebeu que a morte de seu bando era inevitável.\n"+
                            "\nCom pesar, "+principal.Nome()+ " olhou para os olhos de seus companheiros feridos, e a\n"+
                            "tristeza invadiu seu coração.",20);

                    digitacao("- "+principal.Nome()+" ''Precisamos fugir! Não há mais esperança aqui.''",20);
                    principal.perdeBravura(30);

                    digitacao("\nJuntos, eles correram para o navio destruído, desesperados por escapa\n"+
                            "daquela carnificina. Mas enquanto lutavam para abrir caminho entre os\n"+
                            "inimigos, um por um, Cap Yorki e outros companheiros de "+principal.Nome()+" caíram. Seus gritos de dor\n"+
                            "e agonia ecoaram pelos ventos, misturados com o som das lâminas cortantes.\n", 20);
                    principal.perdeBravura(60);
                    yorki.perdeBravura(1000);

                    digitacao("Finalmente, restava apenas "+principal.Nome()+". Sua mente estava turva com a dor e a\n"+
                            "perda, mas ele sabia que tinha que sobreviver. Cada celula de seu corpo\n"+
                            "clamava por vingança, mas ele se obrigou a seguir em frente, lutando com\n"+
                            "as últimas gotas de energia que lhe restavam.\n"+
                            "\nCom lágrimas em seus olhos,"+principal.Nome()+" conseguiu escapar daquele pesadelo.\n"+
                            "Sozinho, ele passou o resto da sua vida infima vagando pelos mares,\n"+
                            "consumido pela culpa e pela tristeza por ter sido o único a sobreviver.\n", 45);
                    principal.perdeBravura(1000);

                    digitacao("|  F I M  |", 70);
                }
                
                //fugir
                else{
                    System.out.println("\n");
                    digitacao(""+principal.Nome()+" pensou profundamente, considerando as consequências de enfrentar\n"+
                            "Vegapunk, um dos piratas mais infames e temidos dos mares.\n"+
                            "\n- "+principal.Nome()+" ''Capitão, se lutarmos agora, seremos superados em números e completamente\n"+
                            "aniquilados. Vamos recuar, ganhar tempo e fortalecer nossa tripulação.\n"+
                            "nos preparar para enfrentar esse desgraçado e quando estivermos prontos\n"+
                            "ninguém ousará desafiar os Piratas Rumbar novamente!!!", 20);
                    principal.perdeBravura(20);
                    yorki.perdeBravura(20);

                    digitacao("Capitulo III | Hachinosu Sangue e Tesouros", 70);
                    principal.dizBravura();
                    yorki.dizBravura();

                    digitacao("Após meses de preparação, os Piratas Rumbar finalmente chegaram à última\n"+
                            "ilha da Grand Line. Era um lugar misterioso e perigoso, conhecido como\n"+
                            "''Hachinosu'', Eles estavam determinados a conquistar a fama e a fortuna que\n"+
                            "os aguardavam, mas sabiam que não estavam sozinhos.\n"+
                            "\nnavegavando pela costa de Hachinosu, uma densa névoa começou a envolver seus\n"+
                            "navios, reduzindo a visibilidade e criando um ar de suspense. De repente, os\n"+
                            "sons de canhões ecoaram pela neblina, seguidos por explosões.\n"+
                            "A névoa se dissipou rapidamente, revelando os imponentes navios da tripulação do Vegapunk.\n"+
                            "\nOs Piratas Rumbar revidaram, disparando seus próprios canhões em resposta ao\n"+
                            "ataque.",20);
                    principal.ganhaBravura(20);
                    yorki.ganhaBravura(20);

                    digitacao("Enquanto os Piratas Rumbar resistiam bravamente, Yorki tomou uma\n"+
                            "decisão audaciosa. Ele ordenou que a sua frota se aproximassem do inimigo,\n"+
                            "buscando um confronto corpo a corpo. A batalha se intensificou à medida que os navios colidiam\n"+
                            "\nNo auge da batalha, Yorki se encontrou em um duelo mortal com o próprio Vegapunk.\n"+
                            "A lâmina afiada Vegapunk atravessou de o corpo de Yorki, cortando seus sonhos e\n"+
                            "esperanças em um instante cruel. Ele caiu de joelhos.",20);
                    yorki.perdeBravura(1000);

                    digitacao("\nEnquanto "+principal.Nome()+" presenciava a morte de seu amado capitão Yorki, a fúria se apoderou de\n"+
                            "seu ser. Com um grito, ele se lançou contra Vegapunk, jurando vingança pelo seu capitão!!",20);
                    principal.ganhaBravura(40);

                    digitacao("\nGolpes brutais eram desferidos. O sangue escorria dos ferimentos, Com a habilidade\n"+
                            "aprimorada pela chama da vingança, "+principal.Nome()+" conseguiu encontrar uma brecha na defesa de\n"+
                            "Vegapunk. Com um golpe poderoso finalmente derrotou o infame capitão.\n"+
                            "\nAo ver seu líder derrotado, os seguidores de Vegapunk recuaram, deixando "+principal.Nome()+"\n"+
                            "exausto, mas triunfante. Ele caiu de joelhos, olhando para o céu enquanto a chuva\n"+
                            "lavava seu rosto coberto de sangue.\n"+
                            "\nCom o coração pesado pela perda de Yorki, "+principal.Nome()+" jurou honrar a memória de seu capitão\n"+
                            "e conduzir os Piratas Rumbar à grandiosidade. O legado de Yorki viveria através dele\n"+
                            "e de sua determinação.\n"+
                            "\nEnquanto a chuva caía sobre a costa da última ilha, "+principal.Nome()+" se levantou, olhando para o\n"+
                            "horizonte com um olhar de determinação. Ele sabia que ainda havia um tesouro a ser \n"+
                            "conquistado, e os Piratas Rumbar continuariam sua jornada, agora com "+principal.Nome()+" como seu novo capitão.\n", 20);
                    principal.ganhaBravura(1000);

                    digitacao("|  F I M  |", 70);
                }
            
            }

            // Bellamy
            else{
                personagem bellamy = new personagem("bellamy");
                digitacao("Atraído pela promessa de poder e fama que o Capitão Bellamy representava, hiro se\n"+
                        "juntou à tripulação\n",20);
                
                bellamy.dizBravura();

                digitacao("\nEnquanto navegavam pelos mares, hiro percebeu que Bellamy tinha uma visão distorcida\n"+
                        "de sucesso, desprezava a ideia de sonhos e ambições, acreditando que o mundo era um \n"+
                        "lugar cruel e que apenas os mais fortes mereciam sucesso.\n",20);
                principal.perdeBravura(20);

                digitacao("\nCerto dia marco e seus companheiros chegaram à ilha Jaya, cruzaram seu caminho com\n"+
                        "Luffy o capitão dos Chapéus de Palha. Bellamy, cheio de arrogância, zombou de Luffy\n"+
                        "e seus sonhos de encontrar o One Piece, desencadeando uma intensa desavença entre os\n"+
                        "dois capitães.\n"+
                        "\nHiro, dividido entre lealdade e seus próprios princípios, testemunhou a luta entre Luffy e Bellamy."+
                        "\nLuffy, com sua força e habilidades de fruta do diabo, derrotou Bellamy, provando que\n"+
                        "sonhos e ambições podem ser poderosas podem impulsionar. A derrota de Bellamy abalou \n"+
                        "profundamente Hiro, que se viu questionando se o caminho pirata era realmente o que\n"+
                        "ele desejava seguir",20);
                principal.perdeBravura(30);
                bellamy.perdeBravura(100);

                digitacao("\nApós o confronto, Luffy se aproximou de Hiro com um sorriso sincero. Ele reconheceu\n"+
                        "o potencial e a determinação de Hiro e ofereceu a ele a oportunidade de se juntar à\n"+
                        "tripulação dos Chapéus de Palha.hiro sabia que a vida de pirata trazia aventuras\n"+
                        "emocionantes e liberdade, mas também podia ser marcada pela violência e caos.\n"+
                        "\nRevoltado com a visão deturpada de sucesso e a crueldade demonstrada por piratas\n"+
                        "como Bellamy, Hiro tomou uma decisão firme e jurou ingressar na Marinha para\n"+
                        "combatê-los. Ele se comprometeu a lutar pela justiça, proteger os inocentes e\n"+
                        "garantir que os mares fossem um lugar seguro para todos.\n", 20);
                
                principal.ganhaBravura(1000);
                digitacao("|  F I M  |", 70);
            }
            
        }

        // Caso Desista
        else{
            
            digitacao("Capitulo II | O Adeus ao Mar", 70);
            
            principal.dizBravura(); 
            
            digitacao(""+principal.Nome()+" reúne sua coragem e parte em busca do seu sonho. Ele se junta a uma tripulação\n"+
            "e juntos, eles embarcam em um pequeno navio rumo ao desconhecido.\n"+
            "\nContudo, a vida marítima não é tão romântica como "+principal.Nome()+" imaginava. Enfrentando\n"+
            "tempestades violentas e encontros com piratas cruéis, a tripulação de "+principal.Nome()+"\n"+
            "experimenta o lado mais sombrio dos mares\n"+
            "\nDurante uma batalha contra um poderoso pirata, "+principal.Nome()+" testemunha a perda trágica de\n"+
            "um membro querido de sua família, que havia embarcado em sua própria jornada como\n"+
            "pirata. A dor da perda é avassaladora, deixando "+principal.Nome()+" profundamente abalado.\n"+
            "\nAlém disso, "+principal.Nome()+" é capturado e aprisionado pela marinha que caça piratas\n"+
            "impiedosamente. Durante seu tempo na prisão, ele testemunha a crueldade e a\n"+
            "brutalidade com que os piratas são tratados, fazendo-o questionar se o caminho\n"+
            "pirata é realmente digno de seguir.\n"+
            "\nEssas experiências traumáticas, combinadas com as incertezas e os desafios\n"+
            "constantes que um pirata enfrenta, levam "+principal.Nome()+" a acreditar que desistir de seu sonho\n"+
            "é a melhor maneira de proteger aqueles que ama e evitar um destino trágico.\n", 20);
            

            principal.perdeBravura(1000);
            
            digitacao("|  F I M  |", 70);
        }
        
        insira.close();
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
        System.out.println("\n");
    }

    //função p/caso o usuario digite errado
    public static boolean repeticao(String opção1,String opção2){
        Scanner insira1 = new Scanner(System.in);
        
        boolean continua = true;
        boolean umououtro = true;

        while (continua){
            String escolha = insira1.nextLine();

            if (escolha.equalsIgnoreCase(opção1)) {
                continua = false;
                
            }
            else if (escolha.equalsIgnoreCase(opção2)) {
                continua = false;
                umououtro = false;
            }
            else {
                digitacao("Você não digitou uma opção válida, tente novamente!!\n", 40);
            }
        }
    return umououtro;   
    }

}

