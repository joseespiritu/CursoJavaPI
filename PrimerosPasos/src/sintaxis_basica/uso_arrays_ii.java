package sintaxis_basica;

import javax.swing.JOptionPane;

public class uso_arrays_ii {

	public static void main(String[] args) {
		// Uso de arrays con bucle for each
		/*String [] paises = new String[8];
		
		for (int i = 0; i<8;i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
		}
			
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		
		String [] paises= {"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		
		for (int i = 0; i<paises.length; i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}
		
		for (String elemento:paises) {
			System.out.println("País: " + elemento);
		}*/
		
		int [] matriz_aletaorios =  new int[150];
		
		for (int i=0; i<matriz_aletaorios.length;i++) {
			matriz_aletaorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int numeros:matriz_aletaorios) {
			System.out.print(numeros + " ");
		}
		
	}

}
