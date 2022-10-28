package Questão2;

public class Pessoas {

    String nome;

    @Override
    public String toString() {
        String saida;
        saida = String.format("%s\n", this.nome);

        return saida;
    }

    public Pessoas(String nome) {
        this.nome = nome;
    }
    
}
