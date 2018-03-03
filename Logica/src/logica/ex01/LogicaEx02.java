package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx02 extends Programa {

	@Override
	public void inicio() {
		double nota1 = leInteiro("Informe a 1ª nota");
		double nota2 = leInteiro("Informe a 2ª nota");
		double nota3 = leInteiro("Informe a 3ª nota");
		double nota4 = leInteiro("Informe a 4ª nota");
		double media = (nota1 + nota2 + nota3 + nota4) / 4.0; 
		escrevaL("a média é: " + media);
		// TODO Auto-generated method stub

	}

}
