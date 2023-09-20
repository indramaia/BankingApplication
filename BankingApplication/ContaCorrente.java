package BankingApplication;
import java.util.ArrayList;

public class ContaCorrente extends Conta {
	
	public String chavePix;
	
	public ContaCorrente(int senha, int numeroAgencia, int numeroConta, double saldo, Pessoa pessoa, String chavePix) {
		super(senha, numeroAgencia, numeroConta, saldo, pessoa);
		this.chavePix = chavePix;
	}
		
	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	public void depositar(double valor) {
		if(valor>0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Seu depósito foi realizado com sucesso. Saldo em conta: R$ " + getSaldo() + "\n");
		}else {
			System.out.println("Seu depósito não foi realizado"+ "\n");
		}
	}
	
	public void enviaPix(double valor, ArrayList<ContaCorrente> contasC, String chavePix) {
		for(ContaCorrente contaCorrente :  contasC) {
			if(contaCorrente.getChavePix() == chavePix) {
				if(contaCorrente.getSaldo() >= valor) {
					setSaldo(getSaldo() + valor);
					System.out.println("Seu pix foi realizado com sucesso. Saldo em conta: R$" +getSaldo()+ "\n");
				}else {
					System.out.println("Seu pix não foi realizado. Saldo insuficiente" + "\n");
				}
			}
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo()-valor);
			System.out.println("Saque realizado com sucesso. Saldo em conta: R$" +getSaldo()+ "\n");
		}else {
			System.out.println("Seu saque não foi realizado. Saldo insuficiente" + "\n");
		}
	}
}
