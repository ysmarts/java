package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx2_2 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº");
		int inv = 0;
		
		while (num > 0) {
		inv = inv * 10 + num % 10;
		num /= 10;
		}
        escrevaL("inv ", inv);
	}

}
