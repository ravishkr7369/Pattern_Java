import java.util.Scanner;


public class rhombusPattern{
	//     *****
	//    *****
	//   *****
	//  *****
	// *****


	public static void main(String[] args) {
		
		int n = 5;

	

		for (int i = 1; i <= n; i++) {

			// for spaces
			for(int col=1;col<=n-i;col++){
				System.out.print(" ");
			}

			// for *
			for(int col=1;col<=n;col++){
				System.out.print("*");
			}

			System.out.println();

			
		}

	}

}