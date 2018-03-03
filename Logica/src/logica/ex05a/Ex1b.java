package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex1b extends Programa {

	@Override
	public void inicio() {

		double soma = 0;
		double preco = 1;
		int i = -1;
		while (preco > 0) {
			i++;
			preco = leInteiro("Informe o preço do produto; ");
			soma += preco;
		}
		escrevaL("A média dos preços é: ", soma / i);
		escrevaL("A soma: ", soma, " o contador: ", i);
	}
}
