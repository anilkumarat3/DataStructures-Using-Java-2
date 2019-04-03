package com.dataStructure.Arrays;

public class ArrayRearrangement {
	public static void rearrangement() {
		int[] arr = new int[] { 2, 5, 7, 8, 10, 5, 11, 4, };
		// find the biggest element in an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int big = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > big) {
				big = arr[i];
			}
		}
		System.out.println("Biggest Element is:" + big);
		// Create an array of biggest size
		int temp[] = new int[big + 1];
		int flag = -1;
		for (int j = 0; j < temp.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				if (j == arr[k]) {
					flag = arr[k];
				}

			}
			if (j == flag) {
				temp[j] = flag;
			} else
				temp[j] = -1;

		}
		System.out.println("Final Array is :");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
	}

	public static void reversanarray() {
		int[] a = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reverse os an Array");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		//rearrangement();
		reversanarray();
	}

}
