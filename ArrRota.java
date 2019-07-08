
public class ArrRota {
	static int[] arr = new int[] { 10, 20, 30, 40, 50, 60 };

	public void arrr() {
		for (int j = 0; j < 2; j++) {
			int temp = arr[0];

			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;

		}

	}

	public void reversarr() {
		int s = 0;
		int e = arr.length;
		while (s <= e) {
			int temp = arr[s];
			arr[s] = arr[e - 1];
			arr[e - 1] = temp;
			s++;
			e--;

		}
	}

	public void rota() {
		for (int i = 0; i < 3; i++) {
			int n = arr.length;
			int t = arr[n - 1];
			for (int i1 = n - 1; i1 > 0; i1--) {
				arr[i1] = arr[i1 - 1];
			}
			arr[0] = t;
		}

	}

	public static void main(String args[]) {
		ArrRota obj = new ArrRota();
		 //obj.arrr();
		//obj.reversarr();
		obj.rota();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
