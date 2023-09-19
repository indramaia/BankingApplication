package BankingApplication;

//CLASSE CONTA + ATRIBUTOS PRIVADOS
public abstract class Conta {
	
	private String tipoConta;
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	private Pessoa pessoa;
		
	//CONSTRUTOR PARA CRIAR NOSSO OBJETO, INICIALIZANDO SEUS ATRIBUTOS:
	public Conta(String tipoConta, int numeroAgencia, int numeroConta, Double saldo, Pessoa pessoa) {
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.pessoa = pessoa;
	}
	
	public Conta() {
		
	}
	
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void depositar(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito foi realizado com sucesso");
		}else {
			System.out.println("Seu depósito não foi realizado");
		}
	}
	
	public void enviaPix(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu pix foi realizado com sucesso");
		}else {
			System.out.println("Seu pix não foi realizado");
		}
	}
	
	public void aplicar(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Sua aplicação foi realizada com sucesso");
		}
	}	
	
	public void sacar(Double valor) {
		if(valor > 0 && this.getSaldo()>= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Não foi possível realizar o saque");
		}
	}
	
	public void resgatar(Double valor) {
		if(valor > 0 && this.getSaldo()>= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Não foi possível realizar o saque");
		}
	}

	public double consultaSaldo(Double saldo) {
		return getSaldo();
	}
	
	public void encerrarConta() {
		
	}	
	
	public void retornarMenuInicial() {
		
	}
}












