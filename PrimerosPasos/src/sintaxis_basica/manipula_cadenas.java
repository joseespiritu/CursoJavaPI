package sintaxis_basica;

public class manipula_cadenas {

	public static void main(String[] args) {
		// Uso de la clase String
		String nombre = "Jose";
		System.out.println("Mi nombre es " + nombre);
		
		// Longitud de caracteres LENGTH
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		// Primera letra CHARAT
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		// Ultima letra del nombre
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));
		
		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		
		// Extraer cadenas, 
		String frase_resumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo... y " +
		frase.substring(29, 57);
		System.out.println(frase_resumen);
		
		// Metodo equals, compara cadenas
		String alumno1, alumno2;
		alumno1="David";
		alumno2="david";
		
		// Siendo mas estricto
		System.out.println(alumno1.equals(alumno2));
		
		//Ignorando si son mayusculas o minusculas
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
