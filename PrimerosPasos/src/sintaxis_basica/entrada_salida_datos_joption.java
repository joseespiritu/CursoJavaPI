package sintaxis_basica;

import javax.swing.JOptionPane;

public class entrada_salida_datos_joption {

	public static void main(String[] args) {
		// Uso de la clase JOptionPane
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre + ". El año que viene tendras " + (edad_usuario+1) + " años");
	}

}
