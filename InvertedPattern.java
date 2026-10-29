public class InvertedPattern {

	// *****
	// ****
	// ***
	// **
	// *


	public static void main(String[] args) {
		
		int n = 5;

		for (int i = 1; i <= n; i++) {

			

			// for *
			for(int col=1;col<=n+1-i;col++){
				System.out.print("*");
			}

			System.out.println();

			
		}

	}

}
