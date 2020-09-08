package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); //Instanciar una clase, Ejemplar de clase		
		//System.out.print(Renault.dime_largo());
		// System.out.println("Este coche tiene: " + Renault.largo + " ruedas");
		
		Coche micoche = new Coche();
		
		micoche.establece_color("Marrón");
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("no");
		System.out.println(micoche.dime_asientos());

	}

}
