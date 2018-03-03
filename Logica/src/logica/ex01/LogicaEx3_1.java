package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_1 extends Programa {

	@Override
	public void inicio() {
		int num1 = leInteiro("informe o 1º numero");
		int num2 = leInteiro("Informe o 2º numero");
		if (num1 == num2) {
			escrevaL("Os numeros são iguais ");
		}
		if (num1 != num2) {
			escrevaL("Os numeros são diferentes ");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
