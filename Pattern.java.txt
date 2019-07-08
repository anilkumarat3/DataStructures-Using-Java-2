import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] Arr = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				Arr[i][j] = sc.nextInt();

			}
		}
		System.out.println("Entered Matrix is");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
               System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int k=0,l=0,i;
		while(k<a && l<b){
			for(i=1;i<b;++i){
				System.out.println(Arr);
			}
		}

	}

}
