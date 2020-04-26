package sintaxis_basica;

import javax.swing.JOptionPane;

public class entrada_numeros {

	public static void main(String[] args) {
		// Uso de formato a salida da datos
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
