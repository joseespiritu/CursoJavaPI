package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Codigo alternativo
		/*Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de Alta: " +  empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " +  empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " +  empleado3.dameFechaContrato());*/
		
		//Codigo n
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990,12,17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995,6,2);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002,3,15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		/*for(int i = 0; i < 3; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*for(int i= 0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() 
					+ " Sueldo: " + misEmpleados[i].dameSueldo()
					+ " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() 
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de alta: " + e.dameFechaContrato());
		}
	}

}

class Empleado {
	
	// Metodo public para que se acceda desde otras clases
	public Empleado(String nom, double sue, int agno, int mes, int dia) { // Constructor
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000,01,01);
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}
