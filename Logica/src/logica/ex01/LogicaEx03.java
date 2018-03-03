package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx03 extends Programa {

	@Override
	public void inicio() {
		double num1 = leInteiro("Informe a base");
		double num2 = leInteiro("Informe a altura");
		escrevaL("A Área é de: ",  (num1 * num2) /2.0 );
		// TODO Auto-generated method stub

	}

}
