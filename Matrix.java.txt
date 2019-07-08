import java.util.Scanner;

public class Matrix {
	private static Scanner sc;

	public static void rotate() {
		int i, j;
		int[][] arr = new int[10][10];
		sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// for(i=0;i<4;i++){
		// for(j=0;j<4;j++){
		// System.out.print(arr[i][j]+" ");
		// }
		// System.out.println();
		// }
		System.out.println("Enter Pattern Array Size");
		int p = sc.nextInt();
		int q = sc.nextInt();
		if (p <= m && q <= n) {
			int[][] patArr = new int[p][q];
			for (i = 0; i < p; i++) {
				for (j = 0; j < q; j++) {
					patArr[i][j] = sc.nextInt();
				}
			}
			int maxSum = 0;
			int temp = 0;
			int locI = -1;
			int locJ = -1;
			for (i = 0; i <= m - p; i++) {
				for (j = 0; j <= n - q; j++) {
					temp = 0;
					for (int k = 0; k < p; k++) {
						for (int l = 0; l < q; l++) {
							if (patArr[k][l] != 0) {
								temp += arr[i + k][j + l];
							}
						}
						if (temp > maxSum) {
							maxSum = temp;
							locI = i;
							locJ = j;
						}
					}
				}
			}
			System.out.println("Maximum sum is: " + maxSum);
			System.out.println("Location of array is: " + locI + " and " + locJ + ".");
			System.out.println("The sub-matrix with maximum sum is:");
			for (i = 0; i < p; i++) {
				for (j = 0; j < q; j++) {
					System.out.print(arr[locI + i][locJ + j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		rotate();
	}

}
