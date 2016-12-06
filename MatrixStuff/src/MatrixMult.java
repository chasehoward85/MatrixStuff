

public class MatrixMult {
	
	public static void mult(int m1[][], int m2[][]){

		int m1columns = m1[0].length;
		int m2columns = m2[0].length;
		int m1rows = m1.length;
		int cols = 0;
		int finalNum = 0;
		int finalArray[][] = new int [m1rows][m2columns];
				
		for(int row = 0; row < m1.length; row++){
			for(int col = 0; col < m2columns; col++){
				for(int j = 0; j < m1columns; j++) {
					finalArray[row][col] = finalArray[row][col] + (m1[row][j] * m2[j][col]);
					
					cols++;
				}
				System.out.print(finalArray[row][col] + "\t");

		System.out.println("");
			}
		}
	}
}
