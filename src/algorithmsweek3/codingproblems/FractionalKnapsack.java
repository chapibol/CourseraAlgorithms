package algorithmsweek3.codingproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, KnapsackItem[] kItems) {
        double value = 0;
        //write your code here
        // sort the array by itemValue in descending order
        Arrays.sort(kItems, Comparator.comparing(KnapsackItem::getItemValue).reversed());
        for (KnapsackItem kItem : kItems) {
            if (capacity == 0) break;
            double amount = Math.min(capacity, kItem.getWeight());
            value += amount * kItem.itemValue;
            capacity -= amount;
        }
        System.out.println("Value gathered is: " + value);
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
        System.out.printf("%.4f", getOptimalValue(capacity, items));
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