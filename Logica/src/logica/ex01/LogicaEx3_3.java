package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_3 extends Programa {

	@Override
	public void inicio() {
		float num1 = leInteiro("Informe o valor de A");
		float num2 = leInteiro("Informe o valor de B");
		if ((num1 / num2) > 0) {
			escrevaL("É divisivel");
		}
		else {
			escrevaL("Não é divisivel");
		}
		// TODO Auto-generated method stub

	}

}
