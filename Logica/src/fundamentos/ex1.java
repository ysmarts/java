package fundamentos;

import javax.swing.JOptionPane;

public class ex1 {
	public static void main(String[] args) {

		String aux;
		int[] quant = new int[3];
		double[] valor = new double[3];
		double total = 0;

		for (int i = 0; i < valor.length; i++) {
			aux = JOptionPane.showInputDialog("Informe a quantidade de produto: ");
			quant[i] = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Informe o valor do produto");
			valor[i] = Double.parseDouble(aux);
			total += quant[i] * valor[i];
		}
		JOptionPane.showMessageDialog(null, "O total é R$" + total);	
	}
}
