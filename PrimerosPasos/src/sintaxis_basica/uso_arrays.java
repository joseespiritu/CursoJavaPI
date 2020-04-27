package sintaxis_basica;

public class uso_arrays {

	public static void main(String[] args) {
		// Uso de arrays
		/*int [] mi_matriz = new int[5];
		 
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;*/
		
		int [] mi_matriz= {5,38,-15,92,71,95,85,65,14,78};
		
		for (int i=0;i<mi_matriz.length;i++) {
			System.out.println("valor del indice " + i + " = " + mi_matriz[i]);
		}
	}

}
