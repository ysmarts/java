package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex1a2 extends Programa {

	@Override
	public void inicio() {

		int i = 0;
		double soma= 0;
		
		for(double preco = leInteiro("Informe o preço do produto; ");
			preco > 0;
			preco = leInteiro("Informe o preço do produto; ")) {
			
			soma += preco;
			i++;

		}
		escrevaL("A média dos preços é: ", soma / i);
		escrevaL("A soma: ", soma, " o contador: ", i);
	}
}
