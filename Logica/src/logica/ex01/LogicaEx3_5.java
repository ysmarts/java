package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class LogicaEx3_5 extends Programa {

	@Override
	public void inicio(){
		int num1 = leInteiro("numero 1");
		int num2 = leInteiro("numero 2");
		if (num1 > num2) {
			escreva( num2 );
			escreva(" ");
			escreva( num1 );
		}
		else {
		if (num1 < num2) {
           escreva( num1);
           escreva(" ");
           escreva( num2);
          }
       }
		if (num1 == num2);{
			escreva( num1 );
			escreva(" ");
	        escreva( num2);
		}	
		}
	}


