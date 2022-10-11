package fibonacci;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um limite para a sequencia de Fibonacci: ");
		int limite = sc.nextInt();
		
		System.out.println(Fibonacci.GerarSequencia(limite));
		
		sc.close(); 
	}

}
