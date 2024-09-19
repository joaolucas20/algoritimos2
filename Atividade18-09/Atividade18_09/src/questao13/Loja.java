package questao13;

import java.util.HashMap;
import java.util.Map;

public class Loja {
    private String nome;
    private Map<String, Funcionario> funcionarios;

    // Construtor
    public Loja(String nome) {
        this.nome = nome;
        this.funcionarios = new HashMap<>();
    }

    // Método para contratar um funcionário
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getNome(), funcionario);
    }

    // Método para registrar entrada de um funcionário
    public void registrarEntrada(String nomeFuncionario, String data, String hora) {
        Funcionario funcionario = funcionarios.get(nomeFuncionario);
        if (funcionario != null) {
            funcionario.registrarEntrada(data, hora);
        }
    }

    // Método para registrar saída de um funcionário
    public void registrarSaida(String nomeFuncionario, String data, String hora) {
        Funcionario funcionario = funcionarios.get(nomeFuncionario);
        if (funcionario != null) {
            funcionario.registrarSaida(data, hora);
        }
    }

    // Método para calcular horas trabalhadas de um funcionário em um dia específico
    public double calcularHorasTrabalhadas(String nomeFuncionario, String data) {
        Funcionario funcionario = funcionarios.get(nomeFuncionario);
        if (funcionario != null) {
            return funcionario.calcularHorasTrabalhadas(data);
        }
        return 0.0;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Map<String, Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    
    public static void main(String[] args) {
        // Criando uma loja
        Loja loja = new Loja("Loja Exemplo");

        // Criando funcionários
        Funcionario f1 = new Funcionario("Ana Oliveira", 3000.00);
        Funcionario f2 = new Funcionario("Carlos Souza", 4500.00);

        // Contratando funcionários
        loja.contratarFuncionario(f1);
        loja.contratarFuncionario(f2);

        // Registrando horários de entrada e saída
        loja.registrarEntrada("Ana Oliveira", "2024-09-19", "08:00");
        loja.registrarSaida("Ana Oliveira", "2024-09-19", "17:00");

        loja.registrarEntrada("Carlos Souza", "2024-09-19", "09:00");
        loja.registrarSaida("Carlos Souza", "2024-09-19", "18:00");

        // Calculando e exibindo horas trabalhadas
        System.out.println("Horas trabalhadas por Ana Oliveira em 2024-09-19: " + loja.calcularHorasTrabalhadas("Ana Oliveira", "2024-09-19") + " horas");
        System.out.println("Horas trabalhadas por Carlos Souza em 2024-09-19: " + loja.calcularHorasTrabalhadas("Carlos Souza", "2024-09-19") + " horas");
    }
}