package questao3;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public int horasCursadas() {
        return disciplinas.stream()
                .filter(d -> d.completada)
                .mapToInt(d -> d.cargaHoraria)
                .sum();
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas de " + nome + ":");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina + " - " + (disciplina.completada ? "Completada" : "Em andamento"));
        }
    }

    public void listarDisciplinasPendentes() {
        System.out.println("Disciplinas pendentes:");
        for (Disciplina disciplina : disciplinas) {
            if (!disciplina.completada) {
                System.out.println(disciplina);
            }
        }
    }
}
