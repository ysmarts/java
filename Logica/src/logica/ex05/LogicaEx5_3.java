package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class LogicaEx5_3 extends Programa {

	@Override
	public void inicio() {

		int num1 = leInteiro("Informe o nº ");
		int num2 = leInteiro("Informe o nº ");
		int num3 = leInteiro("Informe o nº ");
		int num4 = leInteiro("Informe o nº ");
		int num5 = leInteiro("Informe o nº ");
		int valor; 
		escrevaL(valor = ( num1 + num2 + num3 + num4 + num5) );
		escrevaL(valor / 5);
	}
}
