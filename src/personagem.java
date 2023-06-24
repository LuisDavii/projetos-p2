public class personagem{
    String nome;

    int bravura = 100;

    personagem(String nome){
        this.nome = nome;
    }     
 
    String Nome(){
        return nome;
    }
    
    int tiraBravura(int quantidade){
        return bravura = bravura - quantidade;
    }

    int ganhaBravura(int quantidade){
        return bravura = bravura + quantidade;
    }
}
