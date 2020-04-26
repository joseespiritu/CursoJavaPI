package sintaxis_basica;

import java.util.Scanner;

public class entrada_salida_datos {

	public static void main(String[] args) {
		// Uso de la clase Scanner	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años.");
	}

}
