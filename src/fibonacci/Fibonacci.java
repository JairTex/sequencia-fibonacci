package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static List<Integer> GerarSequencia(int limite){
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
				sequencia.add(
						sequencia.get(sequencia.size()-1) + sequencia.get(sequencia.size() - 2));
				
			}
		}
		
		return sequencia;
	}
}
