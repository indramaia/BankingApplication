package BankingApplication;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int opcao;
		int opcaoConta = 0;
		ContaCorrente cc = null;
		ContaPoupanca cp = null;	
		
		do {
			System.out.println("Menu de opções:                  ");
			System.out.println("| Opção 1 - Abrir conta        | ");
			System.out.println("| Opção 2 - Depositar/Aplicar  | ");
			System.out.println("| Opção 3 - Sacar/Resgatar     | ");
			System.out.println("| Opção 4 - Fazer um pix       | ");
			System.out.println("| Opção 5 - Consultar saldo    | ");
			System.out.println("| Opção 6 - Encerrar conta     | ");
			System.out.println("| Opção 7 - Voltar ao Menu     | ");
			opcao = input.nextInt();
			
		    if(opcao == 1) {// OPÇÃO 1 - ABRIR CONTA 		    	
				System.out.println("Que tipo de conta deseja abrir? \n1. Conta Corrente \n2. Conta Poupança");
				opcaoConta = input.nextInt();
				if(opcaoConta == 1) {
					cc = new ContaCorrente();
					System.out.println("Conta corrente criada com sucesso!");
				}else{
					cp = new ContaPoupanca();
					System.out.println("Conta poupança criada com sucesso!");
				}
				
			}else if(opcao == 2) {//OPÇÃO 2 - DEPOSITAR/APLICAR 
				System.out.println("Que tipo de conta deseja utilizar? \n1. Conta Corrente \n2. Conta Poupança");
				opcaoConta = input.nextInt(); 
				if(opcaoConta == 1) {
					System.out.println("Qual o valor do depósito? ");
						double valor = input.nextInt();
						cc.depositar(valor);
						System.out.println("Depósito realizado com sucesso! Seu saldo agora é de " + cc.getSaldo() + "reais");
					}else {
					System.out.println("Qual o valor da aplicação? "); 
						double valor = input.nextInt();
						cp.aplicar(valor);
						System.out.println("Aplicação realizada com sucesso!"); 
			  }			
			 }else if(opcao == 3) {//OPÇÃO 3 - SACAR/RESGATAR 
				System.out.println("Que tipo de conta deseja utilizar? \n1. Conta Corrente \n2. Conta Poupança");
				opcaoConta = input.nextInt(); 
				if(opcaoConta == 1) {
					System.out.println("Qual o valor do saque? ");
						double valor = input.nextInt();
						cc.sacar(valor);
					    System.out.println("Saque realizado com sucesso! Seu saldo agora é de " + cc.getSaldo() + "reais");
					}else {
					System.out.println("Qual o valor do resgate? "); 
						double valor = input.nextInt();
						cp.resgatar(valor);
						System.out.println("Resgate realizado com sucesso!Seu saldo agora é de" + cc.getSaldo() + "reais");
					}
				
			}else if(opcao == 4) {// OPÇÃO 5 - FAZER UM PIX
				System.out.println("Qual o valor do pix?");
				double valor = input.nextInt();
				cc.enviaPix(valor);
				System.out.println("Pix realizado com sucesso! Seu saldo agora é de " + cc.getSaldo() + "reais");
				
				
			}else if(opcao == 5) { // OPÇÃO 5 - CONSULTAR SALDO
				System.out.println("Qual tipo de conta deseja consultar? \n1. Conta Corrente \n2. Conta Poupança");
				opcaoConta = input.nextInt();
				if(opcaoConta == 1) {
					System.out.println("O Saldo da sua conta corrente é: " + cc.getSaldo());
				}else{
					System.out.println("O Saldo da sua conta poupança é: " + cp.getSaldo());
				}
				
			}else if(opcao == 6) {// OPÇÃO 6 - ENCERRAR CONTA
				System.out.println("Qual tipo de conta deseja encerrar? \n1. Conta Corrente \n2. Conta Poupança");
				opcaoConta = input.nextInt();
				if(opcaoConta == 1) {
					System.out.println("Conta Corrente encerrada");
				}else{
					System.out.println("Conta Poupança encerrada");
				}
				
				
			}else if(opcao == 7) {// OPÇÃO 7 - VOLTAR
				
			}
		}while(opcao != 8);
		
 }
}