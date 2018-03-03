package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex3 extends Programa {

	@Override
	public void inicio() {

		int maior = 0;
		int num;
		while (true) {
			num =  leInteiro("Idade: ");  

			if (num <= 0) {
				break;

			}else if (num > maior) { 
				maior = num;
			}

		}

		escrevaL( "O vencedor é: ", maior);

	}
}
