package sintaxis_basica;

public class calculos_conMath {

	public static void main(String[] args) {
		double raiz =  Math.sqrt(9);
		System.out.println(raiz);
		
		// Refundicion de valores
		double num1 = 5.85;
		int resultado = (int)Math.round(num1);
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		int potencia = (int) Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + potencia);
	}

}
