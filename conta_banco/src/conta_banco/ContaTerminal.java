package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 int Numero = 1021;
		 String Agencia = 067-8;
		String NomeDoCliente = Mario Andrade;
		double Saldo = 247.48;
		
		System.out.println("Por favor, digite o número da agencia:");
		System.out.println("por favor, digite seu numero do cliente:");
		System.out.println("Por favor, digite seu nome");
		System.out.println("Olá" + NomeDoCliente + "," "obrigado por criar uma conta em nosso banco, sua agência é" + Agencia + ", conta" +
				+ "   ");
		

	}

}
