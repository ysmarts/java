package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class LogicaEx5_4 extends Programa {

	@Override
	public void inicio() {

		int quant = leInteiro("Informe a quantidade: ");	
		int x, numero, maior = 0;

		for (x = 0; x < quant; x++)
		{
			numero = leInteiro("Informe um nº: ");

			if (numero > maior) {
				maior = numero;
			}
		}
		escreva("O maior ", maior);
	}
}
