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
}