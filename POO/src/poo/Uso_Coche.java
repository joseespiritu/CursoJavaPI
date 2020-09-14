package poo;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); //Instanciar una clase, Ejemplar de clase		
		//System.out.print(Renault.dime_largo());
		// System.out.println("Este coche tiene: " + Renault.largo + " ruedas");
		
		Coche micoche = new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color: "));
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?: "));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?: "));
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es: " + micoche.precio_coche());

	}

}
