package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx2_3 extends Programa {

	@Override
	public void inicio() {
	    int nota100, nota50, nota20, nota5, nota2, nota1;
		int saque = leInteiro("Infomre o valor do saque");
		nota100 = ( saque / 100 );
		escrevaL("Notas de 100: ", nota100);
		nota50 = (( saque - (leInteiro (nota100) * 100)) / 50 );
		escrevaL("Notas de 50: ", nota50);
	}
	}