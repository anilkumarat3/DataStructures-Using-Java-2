
public class Pattern1 {
	public static void main(String args[]) {
		System.out.println("Inside main");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				if (i >= j) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

}
