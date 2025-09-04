package arraysdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 11:57:01 AM
* project: Corejava
*/

public class Matrixaddition {

	public static void main(String[] args) {
		int [][] matrix1= {{1,2,3},{4,5,6}};
		
		int [][]matrix2= {{7,8,9},{10,11,12}};
		
		int rows= matrix1.length;
		int cols=matrix1[0].length;
		int [][] result= new int[rows][cols];
		
		//preform matrix addition
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();;
		}


	}

}
