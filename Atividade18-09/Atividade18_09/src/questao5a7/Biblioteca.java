package questao5a7;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    // Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para remover um livro da biblioteca
    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    
    // Método para listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Livro livro : livros) {
                livro.exibirDetalhes();
                System.out.println();
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();

            // Criando alguns livros
            Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
            Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
            Livro livro3 = new Livro("1984", "George Orwell", 1949);

            // Adicionando livros à biblioteca
            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(livro2);
            biblioteca.adicionarLivro(livro3);

            // Listando os livros da biblioteca
            System.out.println("\nLivros na biblioteca:");
            biblioteca.listarLivros();

            // Buscando um livro pelo título
            String tituloBusca = "1984";
            Livro livroEncontrado = biblioteca.buscarLivroPorTitulo(tituloBusca);
            if (livroEncontrado != null) {
                System.out.println("\nLivro encontrado:");
                livroEncontrado.exibirDetalhes();
            } else {
                System.out.println("\nLivro não encontrado.");
            }

            // Removendo um livro
            biblioteca.removerLivro(livro2);

            // Listando os livros restantes
            System.out.println("\nLivros na biblioteca após remoção:");
            biblioteca.listarLivros();
        }
    }
}