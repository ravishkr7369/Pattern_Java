//       *
//     *   *
//   *       *
// *           *
//   *       *   // 2 part
//     *   *
//       *

public class hollowDiamond {

	public static void main(String[] args) {
		int n = 4;

		// 1st part
		for (int i = 1; i <= n; i++) {

			
			// for spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			if (i == 1 ) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {

				System.out.print("*");

				for (int j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}



		// 2nd part
		for (int i = 1; i <= n-1; i++) {



			// for last row
			
			// for spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}


			// for last row
			if (i == (n-1)) {
			
					System.out.print("*");
				
			}   // middle rows
			else {

				System.out.print("*");


				// spaces
				for (int j = 1; j <= 2*(n-i)-3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
