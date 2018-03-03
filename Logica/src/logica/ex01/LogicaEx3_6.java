package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_6 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("informe sua idade");

//		if(num <= 10) {
//			escreva("Sua classificação é: Infantil");
//		} else if(num <= 15) {
//			escreva("Sua classificação é: Juvenil");
//		} else if(num <= 18) {
//			escreva("Sua classifiucação é: Adulto");
//		}
		
		
		if (num > 18) {
			escreva("Sua classifiucação é: Adulto");
		} else {
			if (num >= 11 && num <= 15) {
				escreva("Sua classificação é: Infanto");
			}
			if (num >= 16 && num <= 18) {
				escreva("Sua classificação é: Juvenil");
			}
			if (num <= 10) {
				escreva("Sua classificação é: Infantil");
			}
		}
	}
}
