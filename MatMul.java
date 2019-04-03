package com.dataStructure.Arrays;

public class MatMul {
	public static void multiplication() {
		int[][] mat1 = new int[][] { { 2, 5, 6, 4 }, { 8, 7, 8, 9 }, { 5, 8, 8, 2 }, { 5, 8, 9, 8 } };
		int[][] mat2 = new int[][] { { 2, 5, 6, 4 }, { 8, 7, 8, 9 }, { 5, 8, 8, 2 }, { 5, 8, 9, 8 } };
		int[][] c = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					c[i][j] = c[i][j] + mat1[i][k] * mat2[k][j];
				}
			}
		}
		System.out.println("Mul:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		multiplication();
	}

}
