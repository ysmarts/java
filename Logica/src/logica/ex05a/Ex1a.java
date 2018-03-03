package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex1a extends Programa {

	@Override
	public void inicio() {

		double soma = 0;
		double preco = leInteiro("Informe o preço do produto; ");
		int i = 0;
		
		while (preco > 0) {
			soma += preco;
			i++;
			preco = leInteiro("Informe o preço do produto; ");
		}

		escrevaL("A média dos preços é: ", soma / i);
		escrevaL("A soma: ", soma, " o contador: ", i);
	}
}
