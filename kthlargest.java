import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class kthlargest {
	int[] a = new int[] { 2, 4, 5, 8, 12, 3, 6, 15, 30, 23, 56, 2, 3, 4, 5 };
	Scanner Sc = new Scanner(System.in);

	public void LargestorSmallest() {
		System.out.println("Enter the Choice");
		System.out.println("1:Largest Element");
		System.out.println("2:Smallest Element");
		int Choice = Sc.nextInt();
		switch (Choice) {
		case 1:
			Largest();
			break;
		case 2:
			Smallest();
			break;
		default:
			System.exit(0);
		}
	}

	public void Largest() {
		System.out.println("Inside Finding the Kth Largest Element:");
		int flag = 1;
		Sorting(flag);
		// System.out.println("Sorted Array is:");
		System.out.println("Enter the Kth Position to Find the Largest Element");
		int k = Sc.nextInt();
		System.out.println("Kth Largest Element is:" + a[k - 1]);

	}

	public void Smallest() {
		System.out.println("Inside Finding the Kth Smallest Element:");
		int flag = 0;
		Sorting(flag);
		// System.out.println("Sorted Array is:");
		System.out.println("Enter the Kth Position to Find the Smallest Element");
		int k = Sc.nextInt();
		System.out.println("Kth Smallest Element is:" + a[k - 1]);

	}

	public void Sorting(int flag) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (flag == 1) {
					if (a[j] < a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				} else if (flag == 0) {
					if (a[j] > a[j + 1]) {
						int temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				}
			}
		}
		System.out.println("Sorted Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public void morethan() {
		for (int i = 0; i < a.length; i++) {
			int cout = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] > a[i]) {
					cout++;
				}
			}
			if (cout >= 2) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

	public void nextgel() {
		for (int i = 0; i < a.length; i++) {
			// break;
			int next = -1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					next = a[j];
					break;
				}
				// j++;
				// break;
			}
			System.out.println(a[i] + "  ------Greater Element is:" + next);

		}
	}

	public void Max1s() {
		int[][] a = new int[4][4];
		int Max = 0;
		int Ival = -1;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter A Matrix:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = SC.nextInt();
			}
		}
		System.out.println("Enterd Matrix is:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 * for (int i = 0; i < 4; i++) { int count = 0;
		 * 
		 * for (int j = 0; j < 4; j++) { if (a[i][j] == 1) { count++; } } if
		 * (count > Max) { Max = count; Ival = i; } } System.out.println(
		 * "The Row Contains Maximum of 1 s are--->" + (Ival + 1));
		 */
		int temp[] = new int[16];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// System.out.print(a[i][j] + " ");
				temp[k] = a[i][j];
				k++;
			}
			// System.out.println();
		}
		System.out.println("Array in One Dimension is:");
		for (int l = 0; l < temp.length; l++) {
			System.out.print(temp[l] + " ");
		}
		System.out.println();
		System.out.println("Inside Sorting:");
		/*
		 * for(int i=0;i<temp.length-1;i++){ for(int j=0;j<temp.length-1-i;j++){
		 * if(a[j]>a[j+1]){ int sec=a[j]; a[j]=a[j+1]; a[j+1]=temp1; } } }
		 */
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		int k1 = 0;
		while (k1 < temp.length) {

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					a[i][j] = temp[k1];
					k1++;

				}
			}
		}

		System.out.println("Sorted Matrix is:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void unique() {
		// HashSet<int> hset=new HashSet<int>();
		HashSet<String> hset = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			int l = a[i];
			// String k=l
			// hset.add(k);
		}
		System.out.println(hset);

	}

	public void MaximumSum() {
		int[][] a = new int[4][4];
		int MaxSum = 0;
		int TempSum = 0;
		int Icol = -1, Irow = -1, SCol = -1, Srow = -1;
		int PrevMaxSum=0;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter A Matrix:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = SC.nextInt();
			}
		}
		System.out.println("Enterd Matrix is:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						TempSum = 0;

						TempSum = a[i][j] + a[k][l];

						if (TempSum > MaxSum && PrevMaxSum!=TempSum) {
							MaxSum = TempSum;
							PrevMaxSum=MaxSum;
							Irow = i;
							Icol = j;
							Srow = k;
							SCol = l;
						}

					}

				}
			}
		}
		System.out.println("Maximun Sum From Elements is " + MaxSum);
		System.out.println("And the Location is from First Element is " + (Irow + 1) + " Row and " + (Icol + 1)
				+ " Column and Second Element is From " + (Srow + 1) + " Row and " + (SCol + 1) + " Coloumn");
		System.out.println("Elements are " + a[Irow][Icol] + " And " + a[Srow][SCol]);

	}

	public static void main(String args[]) {
		kthlargest obj = new kthlargest();
		// obj.LargestorSmallest();
		// obj.morethan();
		// obj.nextgel();
		// obj.Max1s();
		obj.MaximumSum();
		// obj.unique();
	}

}
