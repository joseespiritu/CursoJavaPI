package sintaxis_basica;

import javax.swing.JOptionPane;

public class factorial {

	public static void main(String[] args) {
		// Uso del bucle for
		Long resultado = 1l;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		for(int i = numero; i>0;i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de " +  numero + " es " + resultado);

	}

}
