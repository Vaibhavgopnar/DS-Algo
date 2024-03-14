
public class SpiralMatrixPrint {

	public static void main(String[] args) {

		int row = 4, col = 4;
		int a[][] = { { 1, 2, 3, 4 }, 
							{ 5, 6, 7, 8 }, 
							{ 9, 10, 11, 12 }, 
							{ 13, 14, 15, 16 } };
		spiralPrint(row, col, a);
	}

	private static void spiralPrint(int row, int col, int[][] a) {

		int r = 0, c = 0, i;
		while (r < row && c < col) {
			// print first row
			for (i = c; i < col; i++) {
				System.out.print(a[r][i] + " ");
			}
			r++;
			// print last column
			for (i = r; i <= row - 1; i++) {
				System.out.print(a[i][col - 1] + " ");
			}
			col--;

			// print last row
			if (r < row)
				for (i = col - 1; i >= c; --i) {
					System.out.print(a[row - 1][i] + " ");
				}
			c++;

			// print first column
			for (i = row-2; i >= r ; i--) {
				System.out.print(a[i][0] + " ");
			}
			row--;
	
		}
	}

}
