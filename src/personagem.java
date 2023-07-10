public class personagem{
    String nome;

    int bravura = 100;

    public personagem(String nome){
        this.nome = nome;
    }   

    public void dizBravura(){
        print(nome+" |  Bravura: "+bravura,15 );
        
    }
  
    public void mudaBravura(int quantidade){
        bravura = bravura += quantidade;
        
        if(bravura > 0 && quantidade<0){
            print(nome,15 );
            print("Perdeu "+quantidade+" de bravura",15 );
            print("Sua bravura atual é de: "+bravura,15 );
            print("",15 );
        }

        else if(bravura<=0 && quantidade != 0){
            print(nome,15 );
            print("Perdeu "+quantidade+" de bravura" ,15 );
            print("Sua bravura se esgotou.",15 );
            print(nome+" Não consegirá alcançar o One Piece...",15 );
            print("",15 );
           }
        
        else if(bravura < 190 && quantidade>0){
            print(nome,15 );
            print("Ganhou "+quantidade+" de bravura" ,15 );
            print("Sua bravura atual é de: "+bravura,15 );
            print("",15 );
        }

        else if(bravura >= 200 && quantidade != 0){
            print(nome,15 );
            print("Ganhou "+quantidade+" de bravura" ,15 );
            print("Sua bravura chegou ao Maximo!!",15 );
            print(nome+" Conquistou seu sonho !!",15 );
            print("",15 );
           }
        else {

        }

    }
    public static void print(String texto, int velocidade) {
        capitulo.print(texto,20);
    }
}