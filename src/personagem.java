public class personagem {
    private String nome;
    private int bravura;

    public personagem(String nome, int bravura) {
        this.nome = nome;
        this.bravura = bravura;
    }

    public String getNome() {
        return this.nome;
    }

    public void dizBravura() {
        System.out.println(nome + " |  Bravura: " + bravura);
    }

    public void mudaBravura(int quantidade) {
        bravura = bravura += quantidade;

        if (bravura > 0 && quantidade < 0) {
            System.out.println(nome);
            System.out.println("Perdeu " + quantidade + " de bravura");
            System.out.println("Sua bravura atual é de: " + bravura);
            System.out.println("");
        }

        else if (bravura <= 0 && quantidade != 0) {
            System.out.println(nome);
            System.out.println("Perdeu " + quantidade + " de bravura");
            System.out.println("Sua bravura se esgotou.");
            System.out.println(nome + " Não consegirá alcançar o One Piece...");
            System.out.println("");
        }

        else if (bravura < 190 && quantidade > 0) {
            System.out.println(nome);
            System.out.println("Ganhou " + quantidade + " de bravura");
            System.out.println("Sua bravura atual é de: " + bravura);
            System.out.println("");
        }

        else if (bravura >= 200 && quantidade != 0) {
            System.out.println(nome);
            System.out.println("Ganhou " + quantidade + " de bravura");
            System.out.println("Sua bravura chegou ao Maximo!!");
            System.out.println(nome + " Conquistou seu sonho !!");
            System.out.println("");
        } else {

        }

    }

}