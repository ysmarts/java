package logica.ex07;

import java.util.Scanner;

import br.senai.sp.info132.console.Programa;

public class ex3 extends Programa {

	@Override
	public void inicio() {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número da conta: ");
		int num = ler.nextInt();
		int somar = 0;
		num += ex2.Contrario(num);
		System.out.println(Somaresult(num));
	}

	public static int Somaresult(int numero) {
		int soma = 0, numinvertido = 0, contador = 0;
	 
		while (numero > 0){
		numinvertido *= 10;
		numinvertido += (numero % 10);
		numero /= 10;
		soma += numinvertido * (contador +1);
		}
		return (soma % 10 +1);
	
	
	}
}
