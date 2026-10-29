public class solidPyramid {

		// 	 	 *
		// 		***
		//     *****
		//    *******
		//   *********



	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
				
			// for spaces
			for(int col=1;col<=n-i;col++){
				System.out.print(" ");
			}

			// for * print
			for (int col = 1; col <= 2*i-1; col++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}
}
