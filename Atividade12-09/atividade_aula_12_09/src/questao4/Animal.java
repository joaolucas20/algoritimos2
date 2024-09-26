package questao4;

public class Animal {
    String nome;
    String especie;
    int idade;
    Habitat habitat;

    public Animal(String nome, String especie, int idade, Habitat habitat) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return nome + " (" + especie + ", " + idade + " anos) - Habitat: " + habitat.getTipo();
    }
}
