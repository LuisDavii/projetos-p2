public class personagem{
String nome;
int bravura = 100;

 personagem(String nome){
    this.nome = nome;
 }     
 int tiraBravura(int quantidade){
    bravura = bravura - quantidade;
    return bravura;
 }
 int ganhaBravura(int quantidade){
    bravura = bravura + quantidade;
    return bravura;
 }
 
}
