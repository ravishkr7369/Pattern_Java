public class invertedSolidPyramid {


		// *******
		//  *****
		//   ***
		//    *
		

		public static void main(String[] args) {
			int n = 4;
			for (int i = 1; i <= n; i++) {

				// for spaces
				for (int col = 1; col <= i - 1; col++) {
					System.out.print(" ");
				}

				// for * print				2*n-i-[i-1]
				for (int col = 1; col <= (2*n)-(2*i)+1; col++) {
					System.out.print("*");
				}

				System.out.println();

			}
		}
	

}
