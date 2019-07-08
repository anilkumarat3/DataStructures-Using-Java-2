import java.util.Scanner;

public class QueryProb {
	int[] a = new int[] { 1, 2, 3, 5, 8, 4, 8, 5 };
	int[] Quer1 = new int[3];
	int[] Quer2 = new int[2];

	public void QueryProb() {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter the Number Of Queries");
		int NoQueries = Sc.nextInt();
		for (int k = 0; k < NoQueries; k++) {
			int val = k + 1;
			System.out.println("Enter The  " + val + " Query");
			System.out.println("Enter The Query Size");
			int Size = Sc.nextInt();
			if (Size == 3) {
				System.out.println("Enter the Query:");
				for (int i = 0; i < 3; i++) {
					Quer1[i] = Sc.nextInt();
				}
				System.out.println("Entered Query is:");
				for (int i = 0; i < Quer1.length; i++) {
					System.out.print(Quer1[i] + " ");
				}
				System.out.println();
				if (Quer1[0] == 3) {
					CalSumFromIndex2Index(Quer1[0], Quer1[1], Quer1[2]);
				} else {
					System.out.println("Invalid Queery::::");
				}

			}
			if (Size == 2) {
				System.out.println("Enter the Query:");

				for (int i = 0; i < 2; i++) {
					Quer2[i] = Sc.nextInt();
				}
				System.out.println("Entered Query is:");
				for (int i = 0; i < Quer2.length; i++) {
					System.out.print(Quer2[i] + " ");
				}
				System.out.println();

				if (Quer2[0] == 1) {
					RorateRight(Quer2[0], Quer2[1]);
				} else if (Quer2[0] == 2) {
					LeftRight(Quer2[0], Quer2[1]);

				}
			}
		}

	}

	public void RorateRight(int RighRot, int NumTimes) {
		for (int i = 0; i < NumTimes; i++) {
			int temp = a[a.length - 1];
			for (int k = a.length - 1; k > 0; k--) {
				a[k] = a[k - 1];
			}
			a[0] = temp;
		}
		System.out.println("After Right Rotation The New Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void LeftRight(int LeftRot, int NumTimes) {
		for (int i = 0; i < NumTimes; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("After Left Rotation The New Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public void CalSumFromIndex2Index(int CalSum, int StartIndex, int EndIndex) {
		int TotalSum = 0;

		for (int sum = StartIndex; sum <= EndIndex; sum++) {
			TotalSum = TotalSum + a[sum];
		}
		System.out.println("Sum of Array From Index " + StartIndex + " to " + EndIndex + " is:" + TotalSum);

	}

	public void zero() {
		int count = 0;
		int[] temp = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 8) {
				a[count] = a[i];
				count++;
			}
			if (a[i] == 8) {
				while (j < temp.length) {
					temp[j] = a[i];
				}

			}
			j++;

		}
		while (count < a.length) {
			a[count] = temp[j];
			count++;
			j++;
		}
		System.out.println("Final Array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		QueryProb prob = new QueryProb();
		// prob.QueryProb();
		prob.zero();
	}

}
