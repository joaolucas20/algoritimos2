package questao8a10;

public class Cliente {
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf); // Validação do CPF no setter
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
    }
}