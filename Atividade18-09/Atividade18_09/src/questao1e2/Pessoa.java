package questao1e2;

public class Pessoa {
	String nome;
	Integer  idade;
	
	
	/**
	 * @param nome
	 * @param idade
	 */
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String comprimentar() {
		return "Olá, " + nome + "! Tudo bem?";
		
	}
	
}
