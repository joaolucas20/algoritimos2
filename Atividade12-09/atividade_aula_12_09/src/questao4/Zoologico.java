package questao4;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimaisPorHabitat(String tipoHabitat) {
        System.out.println("Animais no habitat " + tipoHabitat + ":");
        for (Animal animal : animais) {
            if (animal.habitat.getTipo().equalsIgnoreCase(tipoHabitat)) {
                System.out.println(animal);
            }
        }
    }
}
