package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex1 extends Programa {

	@Override
	public void inicio() {

		double preco = 1, soma = 0;
		boolean condicao = true;
		int i = 0;
		while (condicao) {
			preco = leInteiro("Informe o preço do produto; ");
			
			if (preco <= 0) {
				condicao = false;
				escrevaL("A média dos preços é: ", soma / i);
				escrevaL("A soma: ", soma, " o contador: ", i);
			}
			soma += preco;
			i++;
		}

	}

}
