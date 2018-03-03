package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class LogicaEx5_5 extends Programa {

	@Override
	public void inicio() {

		boolean condicao = true;


		while(condicao) {
			double salario = leInteiro(" Informe o Salário");
			double aumento, sal;

			if (salario <= 0) {
				escrevaL("ERRO!\n");
				condicao = false;
			}

			if (salario <= 500 && salario > 0) {
				aumento = salario * 20 / 100; 	
				sal = aumento + salario;
				escrevaL("O salário com o aumento é de ", sal );
			}else if (salario > 500) {
				aumento = salario * 10 / 100; 
				sal = aumento + salario;
				escrevaL("O salário com o aumento é de ", sal );
			}
		}
	}

}