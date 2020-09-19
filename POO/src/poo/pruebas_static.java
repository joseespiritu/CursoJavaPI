package poo;

public class pruebas_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}

}

class Empleados{
	
	private final String nombre;
	private String seccion;
	
	public Empleados(String nom) {
		nombre = nom;
		seccion="Administracion";
	}
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " y la seccion es " + seccion;
	}
	
}
