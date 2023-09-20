package BankingApplication;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistema {

	static ArrayList<ContaCorrente> contasC = new ArrayList<>();
	static ArrayList<ContaPoupanca> contasP = new ArrayList<>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Menu de opções:                  ");
			System.out.println("| Opção 1 - Abrir conta        | ");
			System.out.println("| Opção 2 - Acessar conta      | ");
			System.out.println("| Opção 3 - Sair               | ");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				abrirConta();

				break;

			case 2:
				acessarConta();

				break;

			case 3:

				break;

			default:
			}
		} while (opcao != 4);
	}

	public static void abrirConta() {
		Random aleatorios = new Random();
		Scanner inputs = new Scanner(System.in);
		Scanner inputi = new Scanner(System.in);

		System.out.println("Nome completo: ");
		String nome = inputs.nextLine();

		System.out.println("CPF: ");
		int cpf = inputi.nextInt();

		System.out.println("Endereço: ");
		String endereco = inputs.nextLine();

		System.out.println("Telefone: ");
		int telefone = inputi.nextInt();

		System.out.println("Senha: ");
		int senha = inputi.nextInt();

		double saldo = 0.0;

		int numeroAgencia = aleatorios.nextInt(12345 + 1);
		int numeroConta = aleatorios.nextInt(123456 + 1);

		Pessoa pessoa = new Pessoa(nome, cpf, endereco, telefone);

		System.out.println("Que tipo de conta deseja abrir? \n1. Conta Corrente \n2. Conta Poupança");
		int opcaoConta = inputi.nextInt();
		if (opcaoConta == 1) {
			System.out.println("Digite sua chave Pix: ");
			String chavePix = inputs.nextLine();
			ContaCorrente cc = new ContaCorrente(senha, numeroAgencia, numeroConta, saldo, pessoa, chavePix);
			contasC.add(cc);
			System.out.println("Conta corrente criada com sucesso!" + "\n Número da agência: " + cc.getNumeroAgencia()
					+ "\n Número da conta: " + cc.getNumeroConta());
		} else {
			ContaPoupanca cp = new ContaPoupanca(senha, numeroAgencia, numeroConta, saldo, pessoa);
			contasP.add(cp);
			System.out.println("Conta poupança criada com sucesso!" + "\n Número da agência: " + cp.getNumeroAgencia()
					+ "\n Número da conta: " + cp.getNumeroConta());
		}
	}

	public static void acessarConta() {
		Scanner input = new Scanner(System.in);

		System.out.println("Número da agência: ");
		int numeroAgencia = input.nextInt();

		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();

		System.out.println("Senha: ");
		int senha = input.nextInt();
		
		System.out.println("Que tipo de conta deseja acessar? \n1. Conta Corrente \n2. Conta Poupanca");
		int opcaoConta = input.nextInt();
		double saldo = 0.0;		

		if (opcaoConta == 1) {
			for (ContaCorrente contaCorrente : contasC) {
				if (contaCorrente.getNumeroAgencia() == numeroAgencia) {
					if (contaCorrente.getNumeroConta() == numeroConta) {
						if (contaCorrente.getSenha() == senha) {
							menuContaCorrente(contaCorrente);
						}else {
							System.out.println("Senha incorreta. Tente novamente");
						}
					} else {
						System.out.println("Número de conta inexistente. Tente novamente");
					}
				}else {
					System.out.println("Agência inexistente. Tente novamente");
				}
			}
		} else if (opcaoConta == 2) {
			for (ContaPoupanca contaPoupanca : contasP) {
				if (contaPoupanca.getNumeroAgencia() == numeroAgencia) {
					if (contaPoupanca.getNumeroConta() == numeroConta) {
						if (contaPoupanca.getSenha() == senha) {
							menuContaPoupanca(contaPoupanca);
						} else {
							System.out.println("Senha incorreta. Tente novamente");
						}
					} else {
						System.out.println("Número de conta inexistente. Tente novamente");
					}
				}else {
				    System.out.println("Agência inexistente. Tente novamente");
				}
			}
		}
	}

	public static void menuContaCorrente(ContaCorrente conta) {
		
		Scanner input = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Menu de opções:                  ");
			System.out.println("| Opção 1 - Consultar saldo    | ");
			System.out.println("| Opção 2 - Sacar              | ");
			System.out.println("| Opção 3 - Depositar          | ");
			System.out.println("| Opção 4 - Fazer um pix       | ");
			System.out.println("| Opção 5 - Encerrar conta     | ");
			System.out.println("| Opção 6 - Voltar ao Menu     | ");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				conta.getSaldo();

				break;

			case 2:
				System.out.println("Digite o valor do saque: ");
				double valor = input.nextDouble();
				conta.sacar(valor);

				break;

			case 3:
				System.out.println("Digite o valor do depósito: ");
				double valor1 = input.nextDouble();
				conta.depositar(valor1);

				break;

			case 4:
				System.out.println("Digite o valor do pix: ");
				double valor2 = input.nextDouble();
				System.out.println("Digite a chave pix: ");
				String chavePix = input.nextLine();

				conta.enviaPix(valor2, contasC, chavePix);

				break;

			case 5:
				conta.encerrarConta(conta, contasC);

				break;

			default:

				break;
			}
		} while (opcao != 7);
	}

	public static void menuContaPoupanca(ContaPoupanca conta) {
		
		Scanner input = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Menu de opções:                  ");
			System.out.println("| Opção 1 - Consultar saldo    | ");
			System.out.println("| Opção 2 - Resgatar           | ");
			System.out.println("| Opção 3 - Aplicar            | ");
			System.out.println("| Opção 4 - Encerrar conta     | ");
			System.out.println("| Opção 5 - Voltar ao Menu     | ");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				conta.getSaldo();

				break;

			case 2:
				System.out.println("Digite o valor do resgate: ");
				double valor = input.nextDouble();
				conta.resgatar(valor);

				break;

			case 3:
				System.out.println("Digite o valor da aplicação: ");
				double valor1 = input.nextDouble();
				conta.aplicar(valor1);

				break;

			case 4:
				conta.encerrarConta(contasP, conta);

				break;

			case 5:
				conta.encerrarConta(conta, contasC);

				break;

			default:

				break;
			}
		} while (opcao != 6);
	}
}