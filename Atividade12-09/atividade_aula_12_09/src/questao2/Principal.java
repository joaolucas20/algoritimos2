package questao2;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	        // Adicionando livros à biblioteca
	        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
	        Livro livro2 = new Livro("1984", "George Orwell", 1949);
	        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
	        
	        biblioteca.adicionarLivro(livro1);
	        biblioteca.adicionarLivro(livro2);
	        biblioteca.adicionarLivro(livro3);

	        // Registrando empréstimo
	        biblioteca.registrarEmprestimo("O Hobbit", "Carlos", "25/10/2024");

	        // Verificando disponibilidade de um livro
	        System.out.println("O Hobbit está disponível? " + biblioteca.verificarDisponibilidade("O Hobbit"));

	        // Listando livros emprestados
	        System.out.println("Livros emprestados:");
	        biblioteca.listarEmprestados();
	    }
	}
}
