package questao2;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean emprestado;
    String nomeEmprestado;
    String dataDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;  // Por padrão, o livro não está emprestado
    }

    public void registrarEmprestimo(String nomeEmprestado, String dataDevolucao) {
        this.emprestado = true;
        this.nomeEmprestado = nomeEmprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public void registrarDevolucao() {
        this.emprestado = false;
        this.nomeEmprestado = null;
        this.dataDevolucao = null;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public String toString() {
        if (emprestado) {
            return titulo + " - " + autor + " (Emprestado para " + nomeEmprestado + ", devolução: " + dataDevolucao + ")";
        } else {
            return titulo + " - " + autor + " (Disponível)";
        }
    }
}
