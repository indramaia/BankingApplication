package BankingApplication;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private String endereco;
	private int telefone;
	
	
	public Pessoa(String nome, int cpf, String endereco, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String toStrint() {
		return "\nNome: " + this.getNome() +
				"\nCPF: " + this.getCpf() +
				"\nEndereço: " + this.getEndereco() +
				"\nTelefone: " + this.getTelefone();		
	}
	

	
	
}
