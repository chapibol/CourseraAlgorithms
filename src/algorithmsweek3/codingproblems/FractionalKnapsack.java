package algorithmsweek3.codingproblems;

import java.util.Scanner;

public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, KnapsackItem[] kItems) {
        double value = 0;
        //write your code here
        for (int i = 0; i < kItems.length; i++) {
           System.out.println("Printing Item: " + i + " value: " + kItems[i].getItemValue());
           value += kItems[i].getItemValue();
        }
        // sort the array by itemValue in descending order

        System.out.println("Final added value: " + value + " the capacity: " + capacity);

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        KnapsackItem [] items = new KnapsackItem[n];

        for (int i = 0; i < n; i++) {
            // get value first and then weight for the item
            items[i] = new KnapsackItem(scanner.nextInt(), scanner.nextInt());
        }
        scanner.close();
        System.out.println(getOptimalValue(capacity, items));
    }

    private static class KnapsackItem {
        private double value;
        private double weight;
        private double itemValue;

        public KnapsackItem(int value, int weight){
            this.value = value;
            this.weight = weight;
            itemValue = getValue() / getWeight();
        }

        public double getValue() {
            return value;
        }

        public double getWeight() {
            return weight;
        }

        public double getItemValue() {
            return itemValue;
        }
    }
}