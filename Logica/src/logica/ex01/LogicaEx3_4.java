package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_4 extends Programa {

	@Override
	public void inicio() {
		int num = leInteiro("salário bruto");
		if (num < 300) {
			num = num - ((num /100) * 5);
			escreva("O salario Liquido é de: R$ ");
		    escrevaL(num);
		}
		else {
		if (num > 1200) {
			num = num - ((num /100) * 15);
			escreva("O salario Liquido é de: R$ ");
            escrevaL(num);		
		}
		else { 
			num = num - ((num /100) * 10);
			escreva("O salario Liquido é de: R$ ");
			escrevaL(num);
		}
	}
}
}