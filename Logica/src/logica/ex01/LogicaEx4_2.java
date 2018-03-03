package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4_2 extends Programa {

	@Override
	public void inicio() {
	while (true) {
	double a = leReal ("Informe o 1º lado");
	double b = leReal ("Informe o 2º lado");
	double c = leReal ("Informe o 3º lado");
	
	if (a == b && b == c) {
	escreva("Equilátero");
	} else if ( a != b && a != c && b != c) { 
	escreva("Escaleno");
	} else if (a == b || a == c || b == c) {
    escreva("Isósceles");	
			}
		}
	}
}
