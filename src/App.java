import java.util.Scanner;
import java.util.HashMap;


public class App {
        static leitorDeArquivos leitor = new leitorDeArquivos();
        public static void main(String[] args) {

                // introdução
                print("  Riquezas ");
                print("  Fama");
                print("  Poder");
                print("  Um homem conquistou tudo que o mundo tinha a oferecer, o Rei dos Piratas, Gold Roger." +
                                "\nAntes de ser executado, suas últimas palavras levaram multidões aos mares: ");
                print("- Gold roger ''Querem o meu tesouro? Fiquem a vontade para pegá-lo, procurem, nele está tudo que este mundo pode dar a vocês!''");
                print("E assim se iniciou a grande era dos piratas.");

                HashMap<String,personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
                HashMap<Integer,capitulo> capitulos = leitor.lerCap("rsc/historiaCap.txt",personagens);

                capitulos.get(1).executa();

        }                                       
        public static void print(String texto) {
                capitulo.print(texto, 20);
        }
}