import java.util.Scanner;

public class Ds1 {
	int[] a = new int[] { 10, 20, 30, 40, 50, 60, 70 };

	public void arrrot() {
		System.out.println(a.length);
		/*
		 * int sum = 70; for (int i = 0; i < a.length - 1; i++) { for (int j =
		 * 0; j < a.length; j++) { if (a[i] + a[j] == sum) { System.out.println(
		 * "Pairs are Found at " + i + "th and " + j +" "+
		 * "Location in Which Sum is Equal to " + sum + ":"); } } }
		 */
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Ranges:");
		int rot = Sc.nextInt();
		System.out.println("Enter Ranges");
		int[][] range = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				range[i][j] = Sc.nextInt();
				if (range[i][j] > a.length - 1) {
					System.out.println("Invalid Value::Enter Withing Range Limit");
				}
			}
		}
		System.out.println("Ëntered Ranges are");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(range[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 2; i++) {
			RighRotate(range[i][0], range[i][1]);

		}

	}

	public void RighRotate(int StartRange, int EndRange) {
		System.out.println(StartRange + "  " + EndRange);
		int temp = a[EndRange];
		for (int i = EndRange; i >= StartRange; i--) {
			a[i] = a[i - 1];
		}
		a[StartRange] = temp;
		System.out.println("After Right Rotation:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void left() {
		for (int i = 0; i < 3; i++) {
			int temp = a[0];
			System.out.println(temp);
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("Split and Rotated Array is:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String args[]) {
		Ds1 obj = new Ds1();
		//obj.arrrot();
		obj.left();
	}

}
