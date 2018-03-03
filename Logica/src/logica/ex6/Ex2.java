package logica.ex6;

import br.senai.sp.info132.console.Programa;

public class Ex2 extends Programa {

	@Override
	public void inicio() {

		escrevaL("Escreva fim para terminar o programa");
		escrevaL("-----------------------------------------------------");
		String fim = "fim";

		String[] nomes = new String[10];

		for (int y = 0; y < nomes.length; y++) {
			nomes[y] = leTexto("Informe o nome para ficar no sistema: ");
		}

		String nome = leTexto("Informe o nome: ").toLowerCase();

		while (!nome.equals(fim)) {

			boolean encontrou = false;
			for (int x = 0; x < nomes.length; x++) {
				if (nomes[x].equals(nome)) {
					encontrou = true;
					break;
				} 
			}

			if (encontrou) {
				escrevaL("O nome: ", nome, " foi encontrado");
			} 
			else{
				escrevaL("O nome: ", nome, " não foi encontrado");
			}
			nome = leTexto("Informe o nome: ").toLowerCase();
		}
	}
}
