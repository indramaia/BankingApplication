package BankingApplication;

public class ContaPoupanca extends Conta {
	
	ContaPoupanca(){
		super();		
	}

	public ContaPoupanca(int senha, int numeroAgencia, int numeroConta, Double saldo, Pessoa pessoa) {
		super(senha, numeroAgencia, numeroConta, saldo, pessoa);
	}
	
	public void resgatar(double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo()- valor);
			System.out.println("Resgate realizado com sucesso. Saldo em conta R$" + getSaldo());
		}else {
			System.out.println("O resgate não foi realizado. Saldo insuficiente");
		}
	}
 
	public void aplicar(double valor) {
		if(valor>0) {
			setSaldo((getSaldo() + valor) * 1.01);
			System.out.println("Sua aplicação foi realizada com sucesso. Saldo em conta: R$" + getSaldo());
		}else {
			System.out.println("Não foi possível realizar sua aplicação. Tente novamente");
		}
	}
	

}