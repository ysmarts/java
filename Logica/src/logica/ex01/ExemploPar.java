package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class ExemploPar extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("Escreva um numero");
		
		if (num >= 0) {
			escrevaL("o numero é positivo");
	}
		else {
			escrevaL("o numero é negativo");
		} 	
		
		// TODO Auto-generated method stub

	}

}
