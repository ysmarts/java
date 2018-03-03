package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4_3 extends Programa {

	@Override
	public void inicio() {
		double a = leReal("Informe o valor de a");
		double b = leReal("Informe o valor de b");
		double c = leReal("Informe o valor de c");
		
		double mathi = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		escrevaL(("x' = "), mathi);
		double mathif = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        escrevaL(("x'' = "), mathif);
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         