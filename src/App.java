import java.util.Scanner;

public class App {
        public static void main(String[] args) {
                Scanner insira = new Scanner(System.in);

                // introdução
                print("  Riquezas ", 20);
                print("  Fama", 20);
                print("  Poder", 20);
                print("  Um homem conquistou tudo que o mundo tinha a oferecer, o Rei dos Piratas, Gold Roger." +
                        "\nAntes de ser executado, suas últimas palavras levaram multidões aos mares: ", 20);
                print(
                        "- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''",
                        20);
                print("E assim se iniciou a grande era dos piratas.", 20);

                print("Olá Aventureiro(a), como posso te chamar ? ", 40);
                personagem principal = new personagem(insira.nextLine());
                System.out.println("");
               
                // Cap 1 | Texto
                texto[] cap1Txt = new texto[1]; 
                String cap1 = "Capitulo I | A Duvida Incessante";
                String cap1txt = "Em um pequeno vilarejo no North Blue, vivia um(a) jovem chamado(a) " + principal.nome + ".\n" +
                        "Fascinado(a) pelas histórias de piratas, ele(a) sonhava em se juntar a uma\n" +
                        "tripulação audaciosa e explorar os mares. Entretanto após diversas tentativas\n" +
                        "e repetidos fracassos, " + principal.nome + " começa a questionar seu sonho de se tornar um pirata\n"
                        +"Ele(a) é atormentado por uma série de eventos desanimadores que minam sua\n" +
                        "confiança e abalam sua determinação";
                cap1Txt[0] = new texto(cap1txt,0,0);
                
                
                String txtOpc1_cap1 = "| Tentar | Em busca de tesouros e liberdade, embarque em aventuras\n" +
                        "perigosas pelos mares desconhecidos, desafiando a ordem estabelecida e\n" +
                        "enfrentando rivais implacáveis. O destino do One Piece aguarda por você!!";
                String txtOpc2_cap1 = "| Desistir | O sol poente lança uma sombra melancólica sobre a pequena\n" +
                        "vila onde vive " + principal.nome + ".";
                
                // Cap 2| texto
                // Tentar       
                texto[] cap2Txt = new texto[1];
                String cap2 = "Capitulo II | A Jornada Começa !!";
                String cap2txt = "Determinado(a)," + principal.nome + " busca uma tripulação que aceite aprendizes em sua\n" +
                        "jornada. Ele(a) se depara com Dois navios ancorados no porto:\nUm navio dos Piratas Rumbar" +
                        " e outro da tripulação dos Piratas Bellamy.";
                cap2Txt[0] = new texto(cap2txt,0,0);       
                
                String txtOpc1_cap2= "| Rumbar | uma bando desconhecido cujo ninguém nunca ouviu falar";
                String txtOpc2_cap2= "| Bellamy | Piratas infames cujo seus feitos ecoam pelos 4 mares";
                
                // Cap 3 | texto
                // Caso Rumbar
                texto[] cap3Txt = new texto[2];
                String cap3= "" ;
                String cap3txt = "Como um pirata novato, você se junta a uma pequena tripulação dos\n" +
                                "Piratas Rumbar, liderada pelo audacioso Capitão Yorki.\n"+
                                "\nSob a orientação do Capitão Yorki, você aprende os segredos da vida pirata,\n" +
                                "desde a arte da navegação até as habilidades de combate\n"+
                                "\nApós dois anos navegando com a tripulação dos Piratas Rumbar, " + principal.nome +
                                "\nconquistou a confiança de seu capitão.";
                cap3Txt[0] = new texto(cap3txt,20,0);               
                                
                String cap3txt2 = "Seu comprometimento, habilidades e lealdade ao bando eram incontestáveis.\n" +
                                "\nCerto dia enquanto navegavam pela gran line em busca do one piece, os\n" +
                                "Piratas Rumbar se depararam com uma visão aterrorizante: a tripulação do\n" +
                                "temido Vegapunk se aproximava. Eles haviam cruzado o caminho com um\n" +
                                "dos piratas mais perigosos e cruéis dos mares. Durante uma reunião no\n" +
                                "navio, o Capitão Yorki olha diretamente nos seus olhos e faz uma pergunta\n"+
                                "\n- Cap. Yorki ''" + (principal.nome).toUpperCase()
                                + "!! Chegou a hora de tomarmos uma decisão séria.\n" +
                                "\nDiante dessa tempestade , devemos lutar ou fugir e perecer como meros marujos?''\n"+
                                "- Cap. Yorki ''Decida " + (principal.nome).toLowerCase() + ", qual vai ser?'' ";
                cap3Txt[1] = new texto(cap3txt2,0,0);
                
                String txtOpc1_cap3= "| Lutar |";
                String txtOpc2_cap3= "| Fugir |";

                // Cap 4 | texto
                // Lutar               
                String cap4 = "Capitulo III | Turbulência dos Mares: A Jornada de ";
                texto[] cap4Txt = new texto[4];
                String cap4txt = "- " + principal.nome
                                + " ''Capitão, já enfrentamos muitos inimigos e derramamos sangue juntos\n" +
                                "Se a luta é necessária para proteger nossa tripulação e nossos objetivos,\n" +
                                "então devemos enfrentá-la sem hesitação. Não fugiremos do combate\n" +
                                "quando a honra e nossa liberdade estiverem em jogo!!''";
                cap4Txt[0] = new texto(cap4txt,20,20);
                
                String cap4txt2 = "Chegou o dia em que o destino da tripulação tomou um rumo trágico.\n" +
                                principal.nome + ", estava pronto para provar seu valor no campo de batalha.\n" +
                                "Ao lado do capitão Yorki e dos companheiros de tripulação, ele erguia\n" +
                                "sua espada, ciente dos desafios que estavam por vir.\n" +
                                "\nNessa batalha, o navio foi destruído e muitos membros da tripulação\n" +
                                "perderam a vida. " + principal.nome
                                + ", junto com Yorki e alguns outros sobreviventes,\n" +
                                "lutaram com todas as suas forças. O inimigo era implacável, e o número\n" +
                                "de oponentes era avassalador. Mesmo com cada fibra de seu ser gritando\n" +
                                "por vingança, " + principal.nome + " percebeu que a morte de seu bando era inevitável.\n"
                                +
                                "\nCom pesar, " + principal.nome
                                + " olhou para os olhos de seus companheiros feridos, e a\n" +
                                "tristeza invadiu seu coração.\n"+
                                "\n- " + principal.nome + " ''Precisamos fugir! Não há mais esperança aqui.''";
                cap4Txt[1] = new texto(cap4txt2,-30,0);

                String cap4txt3 = "\nJuntos, eles correram para o navio destruído, desesperados por escapa\n" +
                                "daquela carnificina. Mas enquanto lutavam para abrir caminho entre os\n" +
                                "inimigos, um por um, Cap Yorki e outros companheiros de " + principal.nome
                                + " caíram. Seus gritos de dor\n" +
                                "e agonia ecoaram pelos ventos, misturados com o som das lâminas cortantes.\n";
                cap4Txt[2] = new texto(cap4txt3,-60,-1000);

                String cap4txt4 = "Finalmente, restava apenas " + principal.nome
                                + ". Sua mente estava turva com a dor e a\n" +
                                "perda, mas ele sabia que tinha que sobreviver. Cada celula de seu corpo\n" +
                                "clamava por vingança, mas ele se obrigou a seguir em frente, lutando com\n" +
                                "as últimas gotas de energia que lhe restavam.\n" +
                                "\nCom lágrimas em seus olhos," + principal.nome
                                + " conseguiu escapar daquele pesadelo.\n" +
                                "Sozinho, ele passou o resto da sua vida infima vagando pelos mares,\n" +
                                "consumido pela culpa e pela tristeza por ter sido o único a sobreviver.\n"+
                                "\n"+principal.nome+" Perdeu 1000 de bravura\nSua bravura se esgotou.\n"+principal.nome+
                                " Não consegirá alcançar o One Piece...\n\n|  F I M  |";
                cap4Txt[3] = new texto(cap4txt4,0,0);

                //Fim

                // Cap 5 | texto
                // Fugir
                String cap5 = "Capitulo III | Hachinosu Sangue e Tesouros";
                texto[] cap5Txt = new texto[5];
                String cap5txt = "" + principal.nome
                                + " pensou profundamente, considerando as consequências de enfrentar\n" +
                                "Vegapunk, um dos piratas mais infames e temidos dos mares.\n" +
                                "\n- " + principal.nome
                                + " ''Capitão, se lutarmos agora, seremos superados em números e completamente\n" +
                                "aniquilados. Vamos recuar, ganhar tempo e fortalecer nossa tripulação.\n" +
                                "nos preparar para enfrentar esse desgraçado e quando estivermos prontos\n" +
                                "ninguém ousará desafiar os Piratas Rumbar novamente!!!";
                cap5Txt[0] = new texto(cap5txt,-20,-20);
                
                String cap5txt2 ="\nApós meses de preparação, os Piratas Rumbar finalmente chegaram à última\n" +
                                "ilha da Grand Line. Era um lugar misterioso e perigoso, conhecido como\n" +
                                "''Hachinosu'', Eles estavam determinados a conquistar a fama e a fortuna que\n" +
                                "os aguardavam, mas sabiam que não estavam sozinhos.\n" +
                                "\nnavegavando pela costa de Hachinosu, uma densa névoa começou a envolver seus\n" +
                                "navios, reduzindo a visibilidade e criando um ar de suspense. De repente, os\n" +
                                "sons de canhões ecoaram pela neblina, seguidos por explosões.\n" +
                                "A névoa se dissipou rapidamente, revelando os imponentes navios da tripulação do Vegapunk.\n"
                                +
                                "\nOs Piratas Rumbar revidaram, disparando seus próprios canhões em resposta ao\n" +
                                "ataque.";
                cap5Txt[1] = new texto(cap5txt2,20,20);

                String cap5txt3 = "Enquanto os Piratas Rumbar resistiam bravamente, Yorki tomou uma\n" +
                                "decisão audaciosa. Ele ordenou que a sua frota se aproximassem do inimigo,\n" +
                                "buscando um confronto corpo a corpo. A batalha se intensificou à medida que os navios colidiam\n"
                                +
                                "\nNo auge da batalha, Yorki se encontrou em um duelo mortal com o próprio Vegapunk.\n" +
                                "A lâmina afiada Vegapunk atravessou de o corpo de Yorki, cortando seus sonhos e\n" +
                                "esperanças em um instante cruel. Ele caiu de joelhos.";
                cap5Txt[2] = new texto(cap5txt3,0,-1000);
              
                String cap5txt4 = "\nEnquanto " + principal.nome
                                + " presenciava a morte de seu amado capitão Yorki, a fúria se apoderou de\n" +
                                "seu ser. Com um grito, ele se lançou contra Vegapunk, jurando vingança pelo seu capitão!!";
                cap5Txt[3] = new texto(cap5txt4,40,0);

                String cap5txt5 = "\nGolpes brutais eram desferidos. O sangue escorria dos ferimentos, Com a habilidade\n" +
                                "aprimorada pela chama da vingança, " + principal.nome
                                + " conseguiu encontrar uma brecha na defesa de\n" +
                                "Vegapunk. Com um golpe poderoso finalmente derrotou o infame capitão.\n" +
                                "\nAo ver seu líder derrotado, os seguidores de Vegapunk recuaram, deixando "
                                + principal.nome + "\n" +
                                "exausto, mas triunfante. Ele caiu de joelhos, olhando para o céu enquanto a chuva\n" +
                                "lavava seu rosto coberto de sangue.\n" +
                                "\nCom o coração pesado pela perda de Yorki, " + principal.nome
                                + " jurou honrar a memória de seu capitão\n" +
                                "e conduzir os Piratas Rumbar à grandiosidade. O legado de Yorki viveria através dele\n" +
                                "e de sua determinação.\n" +
                                "\nEnquanto a chuva caía sobre a costa da última ilha, " + principal.nome
                                + " se levantou, olhando para o\n" +
                                "horizonte com um olhar de determinação. Ele sabia que ainda havia um tesouro a ser \n" +
                                "conquistado, e os Piratas Rumbar continuariam sua jornada, agora com " + principal.nome
                                + " como seu novo capitão.\n"+"\n"+principal.nome+" Ganhou 1000 de bravura\n"+
                                "Sua bravura chegou ao Maximo!!\nConquistou seu sonho !!\n\n|  F I M  |";
                cap5Txt[4] = new texto(cap5txt5,0,0);
            
                // fim

                // Cap 6 | Texto
                // Bellamy
                String cap6 = "Capitulo III | "+principal.nome+", da Revolta à Justiça nos Mares";
                texto[] cap6Txt = new texto[3];
                String cap6txt = "Atraído pela promessa de poder e fama que o Capitão Bellamy representava, "
                                + principal.nome + " se\n" +
                                "juntou à tripulação\n"+
                                "\nEnquanto navegavam pelos mares, " + principal.nome
                                + " percebeu que Bellamy tinha uma visão distorcida\n" +
                                "de sucesso, desprezava a ideia de sonhos e ambições, acreditando que o mundo era um \n" +
                                "lugar cruel e que apenas os mais fortes mereciam sucesso.\n";
                cap6Txt[0] = new texto(cap6txt,-20,0);

                String cap6txt2 = "\nCerto dia marco e seus companheiros chegaram à ilha Jaya, cruzaram seu caminho com\n" +
                                "Luffy o capitão dos Chapéus de Palha. Bellamy, cheio de arrogância, zombou de Luffy\n" +
                                "e seus sonhos de encontrar o One Piece, desencadeando uma intensa desavença entre os\n" +
                                "dois capitães.\n" +
                                "\n" + principal.nome
                                + ", dividido entre lealdade e seus próprios princípios, testemunhou a luta entre Luffy e Bellamy."+
                                "Luffy,\n com sua força e habilidades de fruta do diabo, derrotou Bellamy, provando que\n" +
                                "sonhos e ambições podem ser poderosas podem impulsionar. A derrota de Bellamy abalou \n" +
                                "profundamente " + principal.nome
                                + ", que se viu questionando se o caminho pirata era realmente o que\n" +
                                "ele desejava seguir";
                cap6Txt[1] = new texto(cap6txt2,-30,-100);
                
                String cap6txt3 = "Após o confronto, Luffy se aproximou de " + principal.nome
                                + " com um sorriso sincero. Ele reconheceu\n" +
                                "o potencial e a determinação de " + principal.nome
                                + " e ofereceu a ele a oportunidade de se juntar à\n" +
                                "tripulação dos Chapéus de Palha." + principal.nome
                                + " sabia que a vida de pirata trazia aventuras\n" +
                                "emocionantes e liberdade, mas também podia ser marcada pela violência e caos.\n" +
                                "\nRevoltado com a visão deturpada de sucesso e a crueldade demonstrada por piratas\n" +
                                "como Bellamy, " + principal.nome
                                + " tomou uma decisão firme e jurou ingressar na Marinha para\n" +
                                "combatê-los. Ele se comprometeu a lutar pela justiça, proteger os inocentes e\n" +
                                "garantir que os mares fossem um lugar seguro para todos.\n\n"+principal.nome+" Ganhou 1000 de bravura\n"+
                                "Sua bravura chegou ao Maximo!!\nConquistou seu sonho !!\n\n|  F I M  |";
                cap6Txt[2] = new texto(cap6txt3,0,0);

                // Cap 7 | Texto
                // Desistir
                String cap7 = "Capitulo II | O Adeus ao Mar";
                texto[] cap7Txt = new texto[1];
                String cap7txt = "" + principal.nome
                        + " reúne sua coragem e parte em busca do seu sonho. Ele se junta a uma tripulação\n" +
                        "e juntos, eles embarcam em um pequeno navio rumo ao desconhecido.\n" +
                        "\nContudo, a vida marítima não é tão romântica como " + principal.nome
                        + " imaginava. Enfrentando\n" +
                        "tempestades violentas e encontros com piratas cruéis, a tripulação de " + principal.nome + "\n" +
                        "experimenta o lado mais sombrio dos mares\n" +
                        "\nDurante uma batalha contra um poderoso pirata, " + principal.nome
                        + " testemunha a perda trágica de\n" +
                        "um membro querido de sua família, que havia embarcado em sua própria jornada como\n" +
                        "pirata. A dor da perda é avassaladora, deixando " + principal.nome + " profundamente abalado.\n"
                        +
                        "\nAlém disso, " + principal.nome + " é capturado e aprisionado pela marinha que caça piratas\n" +
                        "impiedosamente. Durante seu tempo na prisão, ele testemunha a crueldade e a\n" +
                        "brutalidade com que os piratas são tratados, fazendo-o questionar se o caminho\n" +
                        "pirata é realmente digno de seguir.\n" +
                        "\nEssas experiências traumáticas, combinadas com as incertezas e os desafios\n" +
                        "constantes que um pirata enfrenta, levam " + principal.nome
                        + " a acreditar que desistir de seu sonho\n" +
                        "é a melhor maneira de proteger aqueles que ama e evitar um destino trágico.\n"
                        +"\n"+principal.nome+" Perdeu 1000 de bravura\nSua bravura se esgotou.\n"+principal.nome+
                        " Não consegirá alcançar o One Piece...\n\n|  F I M  |";
                cap7Txt[0] = new texto(cap7txt,0,0);
                // fim
        
                // lógica

                //Personagens
                personagem yorki = new personagem("Yorki");
                personagem bellamy = new personagem("bellamy");

                //Criando os Capitulos
                capitulo capitulo1 = new capitulo( cap1 , cap1Txt , principal , null);
                capitulo capitulo2 = new capitulo( cap2 , cap2Txt , principal , null);
                capitulo capitulo3 = new capitulo( cap3 , cap3Txt , principal , yorki);
                capitulo capitulo4 = new capitulo( cap4 , cap4Txt , principal , yorki);
                capitulo capitulo5 = new capitulo( cap5 , cap5Txt , principal , yorki);
                capitulo capitulo6 = new capitulo( cap6 , cap6Txt , principal , bellamy);
                capitulo capitulo7 = new capitulo( cap7 , cap7Txt , principal , null);

                //Criando as Escolhas

                // 1° Escolha
                escolha[] cap1Escolhas = new escolha[2];
                cap1Escolhas[0] = new escolha(txtOpc1_cap1,"tentar" , capitulo2);
                cap1Escolhas[1] = new escolha(txtOpc2_cap1,"desistir" , capitulo7);
                capitulo1.escolhas = cap1Escolhas;
                
                //2° Escolha
                escolha[] cap2Escolhas = new escolha[2];
                cap2Escolhas[0] = new escolha(txtOpc1_cap2,"rumbar" , capitulo3);
                cap2Escolhas[1] = new escolha(txtOpc2_cap2,"bellamy" , capitulo6);
                capitulo2.escolhas = cap2Escolhas;

                //3° Escolha
                escolha[] cap3Escolhas = new escolha[2];
                cap3Escolhas[0] = new escolha(txtOpc1_cap3,"lutar" , capitulo4);
                cap3Escolhas[1] = new escolha(txtOpc2_cap3,"fugir" , capitulo5);
                capitulo3.escolhas = cap3Escolhas;

                capitulo raiz = capitulo1;               
                raiz.executa();

                insira.close();
        }

        public static void print(String texto, int velocidade) {
         capitulo.print(texto,20);
        }
}