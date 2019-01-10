package algorithmsPartOne.week1;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner stdIn = new Scanner(System.in);
        while (!stdIn.isEmpty()) {
            stack.push(stdIn.readInt());
        }
        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
