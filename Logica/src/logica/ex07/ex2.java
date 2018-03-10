package logica.ex07;

import java.util.Scanner;

import br.senai.sp.info132.console.Programa;

public class ex2 extends Programa {

	@Override
	public void inicio() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int num = ler.nextInt();

		Contrario(num);
		System.out.println(Contrario(num));

	}



	public static int Contrario(int numero) {
		
		int numinvertido = 0;
		while(numero > 0) {
			numinvertido *= 10;
			numinvertido += (numero % 10);
			numero /= 10;
		}
		return numinvertido;
	
	}
}
