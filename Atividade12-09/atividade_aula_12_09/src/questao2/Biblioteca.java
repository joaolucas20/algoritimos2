package questao2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarEmprestimo(String titulo, String nomeEmprestado, String dataDevolucao) {
        for (Livro livro : livros) {
            if (livro.titulo.equals(titulo) && !livro.estaEmprestado()) {
                livro.registrarEmprestimo(nomeEmprestado, dataDevolucao);
                System.out.println("Empréstimo registrado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo.");
    }

    public void listarEmprestados() {
        for (Livro livro : livros) {
            if (livro.estaEmprestado()) {
                System.out.println(livro);
            }
        }
    }

    public boolean verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equals(titulo)) {
                return !livro.estaEmprestado();
            }
        }
        return false; // Livro não encontrado ou não disponível
    }
}