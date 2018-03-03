package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_2 extends Programa {

	@Override
	public void inicio() {
		
		int num = leInteiro("escreva o numero");
		
		if (num % 2 == 0) {
			escreva("O numero é par");
      }
		else {
			escreva("O numero é impar");
		}
	}
}
