// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *





public class butterfly {
	public static void main(String[] args) {
		
		int n=4;
			//first half symmetrical 
		for (int i = 1; i <=n; i++) {

			// 1st part for *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// 2nd part for spaces
			for (int j = 1; j <=(2*n)-(2*i); j++) {
				System.out.print(" ");
			}


			// 3rd part for *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}





		// inverted symmetrical 
		for (int i = 1; i <=n; i++) {

			// 1st part for *
			for (int j = 1; j <= (n-i)+1; j++) {
				System.out.print("*");
			}

			// 2nd part for spaces
			for (int j = 1; j <=(2*i)-2; j++) {
				System.out.print(" ");
			}

			// 3rd part for *
			for (int j = 1; j <= (n - i) + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}


		
	
	
	}
}
