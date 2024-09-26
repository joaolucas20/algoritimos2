package questao4;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        // Criando habitats
	        Habitat terrestre = new Habitat("Terrestre");
	        Habitat aquatico = new Habitat("Aquático");
	        Habitat aereo = new Habitat("Aéreo");

	        // Criando animais
	        Animal leao = new Animal("Leão", "Panthera leo", 5, terrestre);
	        Mamifero golfinho = new Mamifero("Golfinho", "Delphinus", 8, aquatico);
	        Animal aguia = new Animal("Águia", "Aquila", 3, aereo);

	        // Criando zoológico
	        Zoologico zoologico = new Zoologico();

	        // Cadastrando animais
	        zoologico.cadastrarAnimal(leao);
	        zoologico.cadastrarAnimal(golfinho);
	        zoologico.cadastrarAnimal(aguia);

	        // Listando animais por habitat
	        zoologico.listarAnimaisPorHabitat("Terrestre");
	        zoologico.listarAnimaisPorHabitat("Aquático");

	        // Golfinho amamentando
	        golfinho.amamentar();
	    }
	}

}
