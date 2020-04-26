package sintaxis_basica;

import java.util.Scanner;

public class evalua_edad {

	public static void main(String[] args) {
		// Uso de If
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		int edad = entrada.nextInt();
		
		if(edad<18) {
			System.out.println("Eres un adolescente");
		} else if (edad < 40) {
			System.out.println("Eres joven");
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		} else {
			System.out.println("Cuidate");
		}

	}

}
