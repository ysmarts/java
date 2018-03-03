package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx4a_1 extends Programa {

	@Override
	public void inicio() {
		// TODO Auto-generated method stub

	double quant = leInteiro("Informe a quantidade de horas trabalhadas");
	double salario = leInteiro("Informe o salário hora");
	int num = leInteiro("Informe o número de dependentes");
	double inss = 0;
	double ir = 0;
	
	double salariobruto;
	salariobruto = (quant * salario + ( 50.00 * num ));
	escrevaL("Salário Bruto: ", salariobruto )  ;
	
	if ( salariobruto <= 1000  ) {
	inss = salariobruto * 8.5 / 100;
	escrevaL("Desconto INSS ", salariobruto * 8.5 / 100);
	}else if ( salariobruto > 1000 ){
	inss = salariobruto * 9 / 100; 
	escrevaL("Desconto INSS ", salariobruto * 9 / 100 );
	}
	
	if ( salariobruto <= 500) {
	ir = 0;
	escrevaL("Desconto IR = ", 0);
	}else if ( salariobruto <= 1000) {
	ir = salariobruto * 5 / 100;
	escrevaL("Desconto IR = ", salariobruto * 5 / 100 );
	}else if ( salariobruto > 1000){
	ir = salariobruto * 7 / 100;
	escrevaL("Desconto IR = ", salariobruto * 7 / 100 );
	}
	
	escreva("Salário Líquido = ", salariobruto - inss - ir );
	
	}

}
