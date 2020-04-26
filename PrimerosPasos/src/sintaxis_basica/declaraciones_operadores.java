package sintaxis_basica;

public class declaraciones_operadores {
    public static void main(String[] args) {
        int a = 5;
        // Cambio de valor de una variable
        int b;
        b=7;
        int c = b+a;
        //c-=6;
        System.out.println(c);
        
        // Declaracion de constantes
        final double apulgadas = 2.54;
        double cm = 6;
        double resultado = cm/apulgadas;
        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
    }
}