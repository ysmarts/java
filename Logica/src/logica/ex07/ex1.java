package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class ex1 extends Programa {

	@Override
	public void inicio() {
	
		int[] num = new int[1];
		boolean test;
		do {
			test = false;
			for (int i = 0; i < num.length; i++) {
				leInteiro("Infome um nº ");
				if(num[i] < num[i+1]) {
				
			}	
			}
			
		} while (test);
	}

}
