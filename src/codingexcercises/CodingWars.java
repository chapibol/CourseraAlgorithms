package codingexcercises;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream.*;

public class CodingWars {

    public static void main(String[] args){

        System.out.println(camelCase("ackxdfx uj kfaqhv gblxonqqho rjbujg  csaq hvzd   jbujgv jgu wcgblxo"));
    }

    public static String camelCase(String str) {
        // your code here
        if(str.length() == 0){
            return str;
        }

        if(str.length() == 1){
            return str.toUpperCase();
        }

        String [] words = str.trim().replaceAll("\\s+", " ").split(" ");
        return Arrays.stream(words)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining());
    }

    public static String longestConsec(String[] strarr, int k) {
        if(k > strarr.length || k <= 0){
            return "";
        }
        return "";
    }
}
