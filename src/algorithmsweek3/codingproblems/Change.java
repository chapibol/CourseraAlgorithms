package algorithmsweek3.codingproblems;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        final int FIVE = 5;
        final int TEN = 10;

        if(m % TEN == 0) return m / TEN;

        if (m % TEN == m){// m is smaller than TEN
            if(m % FIVE == 0) return m / FIVE;

            if (m % FIVE == m) return m;// m is smaller than 5 then just return m, that is the number of 1's needed
        }

        int remainingAmount = m % TEN;
        int numTenCoins = (m - remainingAmount) / TEN;
        int numFiveCoins = 0;
        int numOneCoins = 0;

        if(remainingAmount % FIVE == 0){
            numFiveCoins++;
        }else if (remainingAmount % FIVE == remainingAmount){
            numOneCoins = remainingAmount;
        }else{
            numOneCoins = (remainingAmount % FIVE); // numOneCoins is the remaining amount at this point.
            numFiveCoins = (remainingAmount - numOneCoins) / FIVE;
        }
        return numTenCoins + numFiveCoins + numOneCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}


