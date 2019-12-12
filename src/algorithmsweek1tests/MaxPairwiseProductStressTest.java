package algorithmsweek1tests;

import algorithmsweek1.MaxPairwiseProduct;

public class MaxPairwiseProductStressTest {

	public static void main(String[] args) {		
		while(true) {
			int n = (int)(Math.random() * 100 + 2); // generate size of array between 2 and 100 inclusive
			System.out.println("Generating " + n + " numbers..");			
			long [] ranNumbers = new long[n];
			
			for(int i = 0; i < n; i++) {
				ranNumbers[i] = (long)(Math.random() * 50 + 1);// generate numbers between 1 and 50 inclusive
				System.out.print(ranNumbers[i] + " "); // print the number
			}			
			System.out.println();
			
			long result1 = MaxPairwiseProduct.getMaxPairwiseProduct(ranNumbers);
			long result2 = MaxPairwiseProduct.getMaxPairwiseProductFast(ranNumbers);
			
			if(result1 != result2) {
				System.out.println("Wrong answer: " + result1 + " " + result2);
				break;
			}else{
				System.out.println("OK");
			}			
		}					
	}
}
