package sintaxis_basica;

import javax.swing.JOptionPane;

public class acceso_aplicacion {

	public static void main(String[] args) {
		// Uso del ciclo indeterminado While
		String clave = "Jose";
		String pass = "";
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
