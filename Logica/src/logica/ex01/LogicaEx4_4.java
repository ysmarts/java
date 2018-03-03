package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4_4 extends Programa {

	@Override
	public void inicio() {
		
		String nome = leTexto("Informe o Nome");
		int nota1 = leInteiro("Informe a Nota");
		int nota2 = leInteiro("Informe a Nota");
		int nota3 = leInteiro("Informe a Nota");
		int falta = leInteiro("Informe o nº de faltas");
		double valor;
		valor = (nota1 + nota2 + nota3 ) / 3.00;
		
		if (valor >= 7 && falta < 15) {
		escrevaL(valor);
		escreva (nome, ", você foi: Aprovado");
		}else if (falta > 15 || valor < 7) {
		escrevaL(valor);
		escreva(nome, ", você foi:Reprovado");
		}
		}
	}
