

import java.util.Scanner;

public class ArrayDataStructures {
	static Scanner Sc = new Scanner(System.in);

	public static void rotationOfArray(int[] a) {
		System.out.println("Before Rotating the Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Number of Rotations");
		int noOfRotations = Sc.nextInt();
		for (int i = 0; i < noOfRotations; i++) {
			int temp = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		System.out.println("After Roatation of Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void leftRotateArray(int[] a) {
		System.out.println("Enter the Number of Left Rotations");
		int noOfRotation = Sc.nextInt();
		for (int i = 0; i < noOfRotation; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("After Left Rotation:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void Check() {
		String a = "union h";
		String b = "union";
		String c = new String("union");
		String d = new String("union");

		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(d == c);
		System.out.println(d.equals(c));
	}

	public static void maximumSum() {
		int[][] a = new int[][] { { 2, 3, 4, 5 }, { 2, 8, 5, 6 }, { 3, 4, 5, 6 }, { 4, 6, 7, 8 } };
		System.out.println("Enterd Matrix Array is:");
		int p = 4;
		int q = 4;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Size of Sub Array is:");
		int m = Sc.nextInt();
		int n = Sc.nextInt();
		int maxSum = 0;
		int Iloc = -1;
		int Jloc = -1;
		int sum = 0;
		if (m <= p && n <= q) {
			for (int i = 0; i <= p - m; i++) {
				for (int j = 0; j <= q - n; j++) {
					sum = 0;
					for (int k = 0; k < m; k++) {
						for (int l = 0; l < n; l++) {
							sum = sum + a[k + i][l + j];
						}
					}
					if (sum > maxSum) {
						maxSum = sum;
						Iloc = i;
						Jloc = j;
					}
				}

			}
			System.out.println("Maximum Sum is:" + maxSum);
			System.out.println("Array is:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[Iloc + i][Jloc + j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void matrixMultiplication() {
		int[][] a = new int[][] { { 10, 20 }, { 2, 5 } };
		int[][] b = new int[][] { { 20, 40 }, { 40, 50 } };
		int[][] c = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Matrix Multiplication:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int[] a = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		matrixMultiplication();
	}

}
