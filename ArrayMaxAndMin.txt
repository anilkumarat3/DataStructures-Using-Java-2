package com.unionbank.data;

import java.util.Scanner;

public class ArrayMaxAndMin {
	int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
	int[] b = new int[] { 5, 6, 7, 8, 9, 10, 11, 12 };
	int[] c = new int[] { 20, 30, 40, 50, 60, 70 };

	public static void maxAndmin() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Element from Array 1");
		int num1 = Sc.nextInt();
		System.out.println("Enter Element from Array 2");
		int num2 = Sc.nextInt();
		System.out.println("Enter Element from Array 3");
		int num3 = Sc.nextInt();
		// Find the Largest Element and Smallest Element
		int big = num1;
		if (num1 < num2 & num2 > num3) {
			big = num2;
		} else if (num3 > num1 & num3 > num2) {
			big = num3;
		}
		System.out.println("Largetst Element in Given Array is: " + big);
		int small = num1;
		if (num2 < num1 & num2 < num3) {
			small = num2;
		} else if (num3 < num1 & num3 < num1) {
			small = num3;
		}
		System.out.println("Smallest Elemnt is :" + small);
		// int diff=big-small;
		System.out.println("Difference between Largest and Smallest Element in GIven is: " + (big - small));

	}

	public static void main(String args[]) {
		maxAndmin();
	}

}
