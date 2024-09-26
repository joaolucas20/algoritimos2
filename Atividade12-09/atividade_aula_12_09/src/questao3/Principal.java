package questao3;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        // Criando professores
	        Professor professor1 = new Professor("Dr. Silva");
	        Professor professor2 = new Professor("Prof. Lima");

	        // Criando disciplinas
	        Disciplina d1 = new Disciplina("Matemática", 60, professor1);
	        Disciplina d2 = new Disciplina("Física", 40, professor2);
	        Disciplina d3 = new Disciplina("Química", 50, professor1);

	        // Criando aluno
	        Aluno aluno = new Aluno("João");

	        // Matriculando aluno em disciplinas
	        aluno.matricularDisciplina(d1);
	        aluno.matricularDisciplina(d2);
	        aluno.matricularDisciplina(d3);

	        // Completando algumas disciplinas
	        d1.completarDisciplina();

	        // Visualizando disciplinas e horas cursadas
	        aluno.listarDisciplinas();
	        System.out.println("Horas cursadas: " + aluno.horasCursadas() + "h");

	        // Listando disciplinas pendentes
	        aluno.listarDisciplinasPendentes();
	    }
	}

}
