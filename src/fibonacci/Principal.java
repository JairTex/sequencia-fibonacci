package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um limite para a sequencia de Fibonacci: ");
		int limite = sc.nextInt();
		System.out.println(Fibonacci(limite));
	}
	
	public static List<Integer> Fibonacci(int limite){
		List<Integer> sequencia = new ArrayList<>();
		if(limite == 1) {
			sequencia.add(1);
		}
		if(limite == 2) {
			sequencia.add(1);
			sequencia.add(1);
		}
		if(limite > 2) {
			sequencia.add(1);
			sequencia.add(1);
			
			for(int i = 1; i <= (limite -2); i++) {
				sequencia.add(sequencia.get(sequencia.size()-1) + sequencia.get(sequencia.size() - 2));
				
			}
		}
		
		return sequencia;
	}

}
