package codingexcercises;

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

	public String getSandwich(String str) {

		int i = 0;
		String locationStr = "";
		while(i < str.length() && i != -1){
			i = str.indexOf("bread", i);
			locationStr = locationStr + i;
			i = i + 5;
		}

		return locationStr;

	}
}