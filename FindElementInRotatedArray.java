package com.dataStructure.Arrays;

import java.util.Scanner;

public class FindElementInRotatedArray {
	static int[] a = new int[] { 5, 8, 52, 40, 2, 10, 50, 89, 55, 1, 23 };
	static Scanner sc = new Scanner(System.in);

	public static void toFindElement() {
		System.out.println("Enter an Element:");
		int element = sc.nextInt();
		// Sort the Given Array Using Bubble Sort:
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length - 1-i; j++) {
				if (a[j] < a[j + 1]) {
					// swap the Elements
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array in Descending Order is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	//Search An Element in an Sorted Array

	public static void main(String args[]) {
		toFindElement();
	}
}
