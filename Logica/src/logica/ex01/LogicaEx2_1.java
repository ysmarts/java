package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx2_1 extends Programa {

	@Override
	public void inicio() {
		double larg = leInteiro("Informe a Largura");
        double comp = leInteiro("Informe o comprimento");
        double profund	= leInteiro("Informe a profundidade");
        escrevaL(" O Preço final é de R$", ( larg * comp * profund) * 45, ",00");
	}

}
