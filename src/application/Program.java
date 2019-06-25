package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta");
		
		System.out.print("Número da conta: ");
		int num = scan.nextInt();
		System.out.print("Titular: ");
		scan.nextLine();
		String titular = scan.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = scan.nextDouble();
		System.out.print("Limite para saque: ");
		double limite = scan.nextDouble();
		
		Conta c = new Conta(num, titular, saldo, limite);
		
		System.out.println();
		System.out.print("Entre com o valor para saque: ");
		double amount = scan.nextDouble();
		
		try {
			c.saque(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", c.getSaldo()));
		}catch (DomainException e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		
		scan.close();
		
		

	}

}
