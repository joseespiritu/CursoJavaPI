package sintaxis_basica;

import javax.swing.JOptionPane;

public class comprueba_mail {

	public static void main(String[] args) {
		// Uso del bucle for
		int arroba=0;
		boolean punto=false;
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for (int i = 0; i<mail.length(); i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}
	}

}
