package questao13;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
    private String nome;
    private double salario;
    private Map<String, RegistroHorario> registros; // Armazena registros de horários

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.registros = new HashMap<>();
    }

    // Métodos para registrar horário
    public void registrarEntrada(String data, String hora) {
        RegistroHorario registro = registros.getOrDefault(data, new RegistroHorario(data));
        registro.setEntrada(hora);
        registros.put(data, registro);
    }

    public void registrarSaida(String data, String hora) {
        RegistroHorario registro = registros.getOrDefault(data, new RegistroHorario(data));
        registro.setSaida(hora);
        registros.put(data, registro);
    }

    // Método para calcular horas trabalhadas em um dia específico
    public double calcularHorasTrabalhadas(String data) {
        RegistroHorario registro = registros.get(data);
        return (registro != null) ? registro.calcularHorasTrabalhadas() : 0.0;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Map<String, RegistroHorario> getRegistros() {
        return registros;
    }
}