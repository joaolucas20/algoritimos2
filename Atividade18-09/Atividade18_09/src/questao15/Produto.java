package questao15;

public class Produto {
    private String nome;
    private double peso; // Peso do produto para otimização de rotas

    // Construtor
    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}