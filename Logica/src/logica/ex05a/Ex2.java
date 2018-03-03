package logica.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex2 extends Programa {

	@Override
	public void inicio() {
		
		escrevaL("Analista=1, Programador=2, Usuário=3, Gestor=4 e Outro=5");
		
		int ana = 0;
		int pro = 0;
		int usu = 0;
		int gest = 0;
		int out = 0;
		int entrada = 0;
		
		do {
			if 
			(entrada == 1) {
			  entrada = leInteiro("Informe o numero: ");
				escrevaL("Analista");
				ana++;
			}else if
			(entrada == 2) {
				  entrada = leInteiro("Informe o numero: ");
					escrevaL("Programador");
					pro++;
			}else if 
			(entrada == 3) {
				  entrada = leInteiro("Informe o numero: ");
					escrevaL("Usuário");
					usu++;
			}else if 
			(entrada == 4) {
				  entrada = leInteiro("Informe o numero: ");
					escrevaL("Gestor");
					gest++;
			}else if 
			(entrada == 5) {
				  entrada = leInteiro("Informe o numero: ");
					escrevaL("Outro");
					out++;
			}
		
		
		
		} while (entrada != 9);
			escreva(ana + pro + usu + gest + out);
		
		
	}

}
