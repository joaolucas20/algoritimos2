package questao11a12;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    // Construtor
    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    // Método para contratar um funcionário
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário contratado: " + funcionario.getNome());
    }

    // Método para demitir um funcionário
    public void demitirFuncionario(Funcionario funcionario) {
        if (funcionarios.remove(funcionario)) {
            System.out.println("Funcionário demitido: " + funcionario.getNome());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Método para calcular o total de salários pagos
    public double calcularTotalSalarios() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public static void main(String[] args) {
        // Criando uma empresa
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90");

        // Criando funcionários
        Funcionario f1 = new Funcionario("Ana Oliveira", 3000.00);
        Funcionario f2 = new Funcionario("Carlos Souza", 4500.00);
        Funcionario f3 = new Funcionario("Maria Lima", 3500.00);

        // Contratando funcionários
        empresa.contratarFuncionario(f1);
        empresa.contratarFuncionario(f2);
        empresa.contratarFuncionario(f3);

        // Calculando e exibindo o total de salários pagos
        System.out.println("Total de salários pagos: R$" + empresa.calcularTotalSalarios());

        // Demitindo um funcionário
        empresa.demitirFuncionario(f2);

        // Calculando e exibindo o total de salários pagos após demissão
        System.out.println("Total de salários pagos após demissão: R$" + empresa.calcularTotalSalarios());
    }
}
