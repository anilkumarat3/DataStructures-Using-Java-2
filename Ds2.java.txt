import java.util.Arrays;

public class Ds2 {
	int[] a = new int[] { 3, 1, 2, 5, 4};

	public void ArrArrangement() {

		int n = a.length;
		System.out.println(n);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		/*
		 * int outofplace = -1; for (int i = 0; i < n; i++) {
		 * 
		 * if (outofplace >= 0) { System.out.println("Inside 1"); if (((a[i] >=
		 * 0) && (a[outofplace] < 0)) || ((a[i] < 0) && (a[outofplace] >= 0))) {
		 * System.out.println("insode"); rightrotate(a, n, outofplace, i); if (i
		 * - outofplace > 2) { outofplace = outofplace + 2; } else { outofplace
		 * = -1; }
		 * 
		 * } } if (outofplace == -1) { if (((a[i] >= 0) && ((i & 0x01) == 0)) ||
		 * ((a[i] < 0) && ((i & 0x01) == 1))) { outofplace = i; }
		 * 
		 * }
		 * 
		 * } System.out.println("Final Array is:"); for (int i = 0; i <
		 * a.length; i++) { System.out.print(a[i] + " "); }
		 * System.out.println();
		 */
		int evenPos = n / 2;
		int OddPos = n - evenPos;
		int[] TempArray = new int[n];
		for (int i = 0; i < n; i++) {
			TempArray[i] = a[i];

		}
		Sorting(TempArray);
		System.out.println("Sorted Array is:");
		for (int k = 0; k < TempArray.length; k++) {
			System.out.print(TempArray[k] + " ");
		}
		System.out.println();
		int j = OddPos - 1;
		for (int i = 0; i < n; i += 2) {
			a[i] = TempArray[j];
			j--;
		}
		j = OddPos;
		for (int i = 1; i < n; i += 2) {
			a[i] = TempArray[j];
			j++;
		}
		System.out.println("Final Array Is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void Sorting(int[] a) {
		System.out.println("Inside Sorting");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		    System.out.print(a[i]+" ");

		    System.out.println();

		}
	}

	/*
	 * private void rightrotate(int[] a2, int n, int outofplace, int i) { int
	 * temp = a[i]; for (int k = i; k > outofplace; i--) { a[i] = a[i - 1]; }
	 * a[outofplace] = temp; }
	 */
	public static void main(String args[]) {
		Ds2 on = new Ds2();
		on.ArrArrangement();
	}

}
