package projects;

public class multiply {
	    public static void main(String[] args) {
	    	int[][] matrix1 = {{1, 2},{3, 4}};
	        int[][] matrix2 = {{5, 6},{7, 8}};
	        int[][] result = multiplymatri(matrix1, matrix2);
	        System.out.println("Matrix:");
	        printMatrix(result);
	    }
	    public static int[][] multiplymatri(int[][] matrix1, int[][] matrix2) {
	        int row1 = matrix1.length;
	        int col1 = matrix1[0].length;
	        int col2 = matrix2[0].length;
	        int[][] res = new int[row1][col2];

	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col2; j++) {
	                for (int k = 0; k < col1; k++) {
	                    res[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        return res;
	    }
	    public static void printMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
