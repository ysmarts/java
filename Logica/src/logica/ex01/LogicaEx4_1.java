package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4_1 extends Programa {

	@Override
	public void inicio() {
	int nota1 = leInteiro("Informe a Nota");
	int nota2 = leInteiro("Informe a Nota");
	int nota3 = leInteiro("Informe a Nota");
	int nota4 = leInteiro("Informe a Nota");
	double valor;
	valor = (nota1 + nota2 + nota3 + nota4) / 4.00;
	
	if (valor >= 7) {
	escrevaL(valor);
	escreva("Aprovado");
	}
	else {
	escreva("Reprovado");
		}
	}
}
