package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		String agencia;
		String NomeCliente;
		double saldo;

		System.out.println("------CONTA BANCÁRIA------- ");
		System.out.println();
		
		System.out.println("POR FAVOR, DIGITE O NÚMERO DA SUA CONTA: ");
		numero = sc.nextInt();

		System.out.println("DIGITE SUA AGÊNCIA: ");
		agencia = sc.next();

		System.out.println("POR FAVOR, INFORME SEU NOME: ");
		NomeCliente = sc.next();
		sc.nextLine();

		System.out.println("POR GENTILEZA, INFORME SEU SALDO: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf(
				"Olá %s ,obrigado por criar uma conta em nosso banco, sua agência é: %s \n"
						+ "sua conta é: %d e seu saldo é: %.2f  e já está disponivel.",
				NomeCliente, agencia, numero, saldo);

		sc.close();
	}

}
