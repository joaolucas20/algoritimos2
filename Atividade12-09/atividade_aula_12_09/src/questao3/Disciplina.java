package questao3;

public class Disciplina {
    String nome;
    int cargaHoraria;
    Professor professor;
    boolean completada;

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.completada = false; // Por padrão, a disciplina não está completada
    }

    public void completarDisciplina() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return nome + " - " + cargaHoraria + "h (Professor: " + professor.nome + ")";
    }
}