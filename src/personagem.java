public class personagem{
    String nome;

    int bravura = 100;

    public void dizBravura(){
        System.out.println(nome+" |  Bravura: "+bravura);
        System.out.println("");
    }

    public personagem(String nome){
        this.nome = nome;
    }     
 
    public void mudaBravura(int quantidade){
        bravura = bravura += quantidade;
        
        if(bravura > 0 && quantidade<0){
            System.out.println(nome);
            System.out.println(quantidade+" de bravura" );
            System.out.println("Sua bravura atual é de: "+bravura);
            System.out.println("");
        }

        else if(bravura<0){
            System.out.println(nome);
            System.out.println(quantidade+" de bravura" );
            System.out.println("Sua bravura se esgotou.");
            System.out.println(nome+" Não consegirá alcançar o One Piece...");
            System.out.println("");
           }

        
        else if(bravura < 190 && quantidade>0){
            System.out.println(nome);
            System.out.println(quantidade+" de bravura" );
            System.out.println("Sua bravura atual é de: "+bravura);
            System.out.println("");
        }

        else{
            System.out.println(nome);
            System.out.println(quantidade+" de bravura" );
            System.out.println("Sua bravura chegou ao Maximo!!");
            System.out.println(nome+" Conquistou seu sonho !!");
            System.out.println("");
           }

    }

}