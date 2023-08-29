import java.util.HashMap;
import java.util.Scanner;

public class capituloImagem extends capitulo{
private String imagem = "";

capituloImagem(HashMap<String, personagem> personagens, Scanner escaneador){
    super();
    lerCap(personagens, escaneador);
}


protected void lerCap(HashMap<String, personagem> personagens, Scanner escaneador){
    super.lerCap(personagens, escaneador);
    String Linha = escaneador.nextLine();//inicio da imagem
    while(!Linha.equalsIgnoreCase("fim_img")){
        this.imagem= imagem+"\n"+Linha;
        Linha= escaneador.nextLine();
        }
        
}

protected void historia(){
    System.out.println(imagem);
    System.out.println("");
    System.out.println("----------------------------");
    System.out.println("");
    super.historia();
}
}
