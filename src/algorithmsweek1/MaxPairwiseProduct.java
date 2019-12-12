package algorithmsweek1;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
	
	 public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        long[] numbers = new long[n];
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        System.out.println(getMaxPairwiseProductFast(numbers));
	}
	 
    public static long getMaxPairwiseProduct(long[] numbers) {
        long maxProduct = 0;
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxProduct = Math.max(maxProduct, numbers[i] * numbers[j]);
            }
        }

        return maxProduct;
    }
    
    public static long getMaxPairwiseProductFast(long [] numbers) {
    	Arrays.sort(numbers);
    	int lastIndex = numbers.length - 1;
    	return numbers[lastIndex - 1] * numbers[lastIndex];
    }    

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
