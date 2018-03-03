package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class LogicaEx05_1 extends Programa {

	@Override
	public void inicio() {

		int cont = 0;

		while (cont <= 1000) {
			cont++;
			if (cont % 2 == 0) {

				escreva(String.format("%04d ", cont));
			}

		}
	}
}