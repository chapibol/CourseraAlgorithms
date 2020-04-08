package codewars;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main (String [] args) {



    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        if(names.length == 0){
            return "no one likes this";
        }

        System.out.println(names[0] + " likes this");
        String result = "";
        for(String name: names){
            result = result + name;
        }
        return result;
    }

    public static int solution(int number) {
        Set<Integer> multiples = new HashSet<>();

        int temp3Multiple = 3;
        while(temp3Multiple < number){
            multiples.add(temp3Multiple);
            temp3Multiple += 3;
        }

        int temp5Multiple = 5;
        while(temp5Multiple < number){
            multiples.add(temp5Multiple);
            temp5Multiple += 5;
        }

        int sum = 0;
        for(Integer i: multiples){
            sum += i;
        }
        return sum;
    }

    public static boolean check(String sentence){

//        String str = "The quick brown box jumps over the lazy dog.";
//        for(char c :str.toCharArray()){
//
//            System.out.println(c + " is type: " + Character.getType(c));
//        }

        Set<Character> chars = new HashSet<>();

        for(char c: sentence.toCharArray()){
            if(Character.isLetter(c)){
                chars.add(Character.toLowerCase(c));
            }
        }

        return chars.size() == 26;
    }
}