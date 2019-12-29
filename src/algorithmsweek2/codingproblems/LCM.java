package algorithmsweek2.codingproblems;
import java.util.*;

public class LCM {
    private static long lcmNaive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm(a, b));
    }

    private static long lcm(int a, int b) {
        return (long)(a / gcd(a, b)) * b;
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,  a % b);
    }
}
