package sintaxis_basica;

public class arrays_bidimensionales {

	public static void main(String[] args) {
		// Arrays Bidimensionales
		
		int [][] matrix = new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=12;
		matrix[0][2]=321;
		matrix[0][3]=45;
		matrix[0][4]=21;
		
		matrix[1][0]=32;
		matrix[1][1]=3451;
		matrix[1][2]=21;
		matrix[1][3]=23;
		matrix[1][4]=43;
		
		matrix[2][0]=43;
		matrix[2][1]=564;
		matrix[2][2]=342;
		matrix[2][3]=213;
		matrix[2][4]=4;
		
		matrix[3][0]=423;
		matrix[3][1]=5;
		matrix[3][2]=654;
		matrix[3][3]=23;
		matrix[3][4]=54;
		
		for (int i = 0; i<4;i++) {
			System.out.println();
			for (int j = 0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

}
