package com.dataStructure.Arrays;

public class Puzzle1 {
	public static void calMaxSum() {
		int[][] mat = new int[][] { { 2, 5, 6, 4 }, { 8, 7, 8, 9 }, { 5, 8, 8, 2 }, { 5, 8, 9, 8 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		// System.out.println("Enter the Pattern Size");
		int m = 2, n = 2;
		int sum = 0;
		int temSum = 0;
		int locI = -1;
		int locJ = -1;
		for (int i = 0; i <= 4 - m; i++) {
			for (int j = 0; j <= 4 - n; j++) {
				temSum = 0;
				for (int k = 0; k < m; k++) {
					for (int l = 0; l < n; l++) {
						temSum = temSum + mat[k + i][l + j];
					}
				}
				if (temSum > sum) {
					sum = temSum;
					locI = i;
					locJ = j;
				}

			}
		}
		System.out.println("Maximum Sum is:" + sum);
		System.out.println("Matrix of Maximum Sum is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[locI + i][locJ + j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		calMaxSum();
	}

}
