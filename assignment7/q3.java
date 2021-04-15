package assignment7;

public class q3 {
	public void setZeroes(int[][] matrix) {
		int[][] m = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0 && m[i][j] != 1) {
					for (int p = 0; p < matrix[i].length; p++) {
						if (matrix[i][p] != 0)
							m[i][p] = 1;
						matrix[i][p] = 0;
					}
					for (int z = 0; z < matrix.length; z++) {
						if (matrix[z][j] != 0)
							m[z][j] = 1;
						matrix[z][j] = 0;
					}
				}
			}
		}
	}
}
