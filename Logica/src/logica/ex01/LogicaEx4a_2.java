package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4a_2 extends Programa {

	@Override
	public void inicio() {
		// TODO Auto-generated method stub

		escrevaL("                                                 MÉDIA APURADA ");
	int num1 = leInteiro("Informe a primeira nota");
	int num2 = leInteiro("Infomre a segunda nota");
	int media = num1 + num2 / 2  ;
	
	if (media <= 60) {
	escrevaL("Insuficiente");
	}else if ( 60 < media && media <= 80){
	escrevaL("Satisfatória");
	}else if ( 80 < media && media <= 90){
	escrevaL("Boa");
	}else if ( media > 90){
	escrevaL("Excelente");
	}
  }
}
