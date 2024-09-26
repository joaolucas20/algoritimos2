package questao1;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        Produto camisa = new Produto("Camisa", 49.90);
	        Produto calca = new Produto("Calça", 89.90);

	        Cliente mateus = new Cliente("Mateus");
	        
	        mateus.adicionarAoCarrinho(camisa, 2);
	        mateus.adicionarAoCarrinho(calca, 1);
	        mateus.mostrarCarrinho();

	        mateus.removerDoCarrinho(camisa);
	        mateus.mostrarCarrinho();
	    }
	}
}
