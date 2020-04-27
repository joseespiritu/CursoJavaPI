package sintaxis_basica;

public class arrays_bidimensionales_ii {

	public static void main(String[] args) {
		// Arrays bidimensionales
		
		int [][] matrix= {
				{10,2,32,4,21},
				{21,23,43,54,23},
				{21,324,54,231,1},
				{232,543,76,23,453}
		};
		
		for (int[] fila:matrix) {
			System.out.println();
			for (int z:fila) {
				System.out.print(z + " ");
			}
		}

	}

}
