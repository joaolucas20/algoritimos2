package questao4;

public class Mamifero extends Animal {
    public Mamifero(String nome, String especie, int idade, Habitat habitat) {
        super(nome, especie, idade, habitat);
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }
}
