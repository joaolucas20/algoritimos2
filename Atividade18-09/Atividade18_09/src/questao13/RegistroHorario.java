package questao13;

import java.time.LocalTime;
import java.time.Duration;

public class RegistroHorario {
    private String data;
    private String entrada;
    private String saida;

    // Construtor
    public RegistroHorario(String data) {
        this.data = data;
        this.entrada = null;
        this.saida = null;
    }

    // Métodos para definir entrada e saída
    public void setEntrada(String hora) {
        this.entrada = hora;
    }

    public void setSaida(String hora) {
        this.saida = hora;
    }

    // Método para calcular as horas trabalhadas
    public double calcularHorasTrabalhadas() {
        if (entrada != null && saida != null) {
            LocalTime entradaTime = LocalTime.parse(entrada);
            LocalTime saidaTime = LocalTime.parse(saida);
            Duration duration = Duration.between(entradaTime, saidaTime);
            return duration.toHours() + (duration.toMinutes() % 60) / 60.0;
        }
        return 0.0;
    }

    // Getters
    public String getData() {
        return data;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSaida() {
        return saida;
    }
}