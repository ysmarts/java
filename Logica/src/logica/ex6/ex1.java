package logica.ex6;

import br.senai.sp.info132.console.Programa;

public class ex1 extends Programa {

	@Override
	public void inicio() {

		int[] val = new int[10];
		double soma = 0;
		double resultado;
		

		for (int valores = 0; valores < val.length; valores++) {
			val [valores] = leInteiro("Informe o valor ", valores+1);
			soma += val[valores];
			if (val[valores] <= 0) {
				escrevaL("O valor deve ser maior que 0");
				valores--;	
			}
		}
		resultado = soma / val.length;
		
		for(int x = 0; x < val.length; x++) {
			if (val[x] > resultado) {
				escrevaL(val[x]);
			}
		}
		escreva("\nA média dos valores é: ", resultado);
		
			
		
		
	}
}

