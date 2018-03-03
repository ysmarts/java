package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class LogicaEx5_2 extends Programa {

	@Override
	public void inicio() {

		int num1 = leInteiro("Informe o 1º nº");
		int num2 = leInteiro("Informe o 2º nº");

		if (num1 > num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}

		for(int i = num1; i <= num2;i++){
			if (i % 2 != 0) {
				escrevaL(String.format("%04d", i ));
			}
		}
	}
}
