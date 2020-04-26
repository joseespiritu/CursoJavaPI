package sintaxis_basica;

import java.util.Scanner;

public class adivina_numero {

	public static void main(String[] args) {
		// Juego adivina numero
		int aleatorio=(int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		while (numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un numero, por favor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("Más bajo");
			} else if (aleatorio>numero) {
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
	}

}
