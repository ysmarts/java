package logica.ex6;



import javax.swing.text.Utilities;

import br.senai.sp.info132.console.Programa;

public class ex3 extends Programa {

	@Override
	public void inicio() {
		int[] numeros = new int[10];
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = leInteiro("Informe os números: ", x+1);
		}
		boolean trocou;
		do {
			trocou = false;
			for (int y = 0; y < numeros.length - 1; y++) {
				if(numeros[y] > numeros[y+1]) {
					int aux = numeros[y+1];
					numeros[y+1] = numeros[y];
					numeros[y] = aux;
					trocou = true;
				}
			}
		} while(trocou);

		escrevaL("Números pares em ordem crescente");
		for (int y = 0; y < numeros.length; y++) { 
			if (numeros[y] % 2 == 0) {
				escreva(numeros[y], "  ");
			}
		}
		escrevaL("");
		escrevaL("Números impares em ordem decrescente");	
		for (int y = numeros.length - 1; y >= 0; y--) {     //----> o Y = NUMEROS.LENGTH será o 10 - 1, pois conta o 0
			if (numeros[y] % 2 != 0)
				escreva(numeros[y], "  ");
		} 
	}
}