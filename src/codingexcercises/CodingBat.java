package codingexcercises;

import java.util.ArrayList;

public class CodingBat {

	public static void main(String[] args) {
		int small = 2;
		int big = 2;
		int goal = 8;
		boolean canMakeBrick = makeBricks(small, big, goal);

		System.out.println("small = " + small + " big = " + big + " goal = " + goal);
		System.out.println(canMakeBrick);
	}

	public static boolean makeBricks(int small, int big, int goal) {
		int bigSum = big * 5;

		if(bigSum + small < goal){
			return false;
		}else return goal % 5 <= small;
	}

	public static boolean xyzMiddle(String str) {
		if(str.length() >= 3){
			//determine if even or odd
			int end = (str.length() / 2) + 2;
			if(str.length() % 2 == 0){
				int begin = (str.length() / 2) - 2;
				return str.substring(begin, end).contains("xyz");
			}else{
				int begin = (str.length() / 2) - 1;
				return str.substring(begin, end).equals("xyz");
			}
		}else {
			return false;
		}
	}

	public static String getSandwich(String str) {
		ArrayList<Integer> locations = new ArrayList<>();

		int i = str.indexOf("bread");
		if(i == -1){
			return "";
		}else{
			locations.add(i);
			while(i >= 0 && i + 5 < str.length()){
				i = str.indexOf("bread", i + 5);
				locations.add(i);
			}
			locations.removeIf(n -> (n == -1));
			if(locations.size() > 1){// at least 2 breads need to be found and then return the string sadwiched in between
				return str.substring(locations.get(0) + 5, locations.get(locations.size() - 1));
			}else{// if only one bread found then return empty
				return "";
			}
		}
	}
}