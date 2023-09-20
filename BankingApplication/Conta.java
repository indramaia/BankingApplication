package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

//CLASSE CONTA + ATRIBUTOS PRIVADOS
public class Conta {
	
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	private int senha;
	private Pessoa pessoa;
		
	//CONSTRUTOR PARA CRIAR NOSSO OBJETO, INICIALIZANDO SEUS ATRIBUTOS:
	public Conta(int senha, int numeroAgencia, int numeroConta, Double saldo, Pessoa pessoa) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.senha = senha;
		this.pessoa = pessoa;
	}
	
	public Conta() {
		
	}	
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
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
		
	public void encerrarConta(Conta conta, ArrayList<ContaCorrente> contasC) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Você tem certeza que quer encerrar sua conta? \n1. Sim \n2. Não");
			int opcao = input.nextInt();
			if(opcao == 1) {
				contasC.remove(conta);
				System.out.println("Conta corrente encerrada");
			}else {
				System.out.println("A conta não foi encerrada. Tente novamente");
			}
		}
	}	
	
	public void encerrarConta(ArrayList<ContaPoupanca> contasP, Conta conta) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Você tem certeza que quer encerrar sua conta? \n1. Sim \n2. Não");
			int opcao = input.nextInt();
			if(opcao == 1) {
				contasP.remove(conta);
				System.out.println("Conta Poupança encerrada");
			}else {
				System.out.println("A conta não foi encerrada. Tente novamente");
			}
		}
	}	
}