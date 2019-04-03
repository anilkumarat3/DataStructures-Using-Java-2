package com.dataStructure.Arrays;

import java.util.Scanner;

public class ArrayRotations {
	static int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
	static Scanner sc = new Scanner(System.in);

	public static void rightRotation() {
		System.out.println("Enter the Number of Rotations:");
		int numberOfRota = sc.nextInt();
		for (int i = 0; i < numberOfRota; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("Final Array After " + numberOfRota + " Rotations is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void reverseOfAnArray() {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reverse OF an Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void rightRotationOfArray() {
		System.out.println("Enter the Number of Rotations:");
		int noOfRoataion = sc.nextInt();
		for (int i = 0; i < noOfRoataion; i++) {
			int temp = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		System.out.println("Final Array After " + noOfRoataion + " Rotations is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// rightRotation();
		// reverseOfAnArray();
		rightRotationOfArray();
	}

}
