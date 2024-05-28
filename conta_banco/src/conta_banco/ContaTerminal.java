package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 int numero = 1021;
		 //numero = sc.nextInt();
		 double agencia = 067-8;
		String nome = "Mario Andrade";
		//String NomeDoCliente = Mario;
		double saldo = 247.48;
		
		System.out.println("Por favor, digite o número da agencia: ");
		agencia = sc.nextDouble();
		System.out.println("O numero da sua agencia é: " + agencia );
		//System.out.println("por favor, digite seu numero do cliente:");
		//System.out.println("Por favor, digite seu nome");
		//System.out.println("Olá" + nome + ", Obrigado por criar uma conta Em nosso banco, sua agência é " + agencia);
		
		sc.close();
	}

}
