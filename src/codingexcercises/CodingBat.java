package codingexcercises;

public class CodingBat {

	public static void main(String[] args) {
		boolean canMakeBrick = makeBricks(3, 2, 8);
		
		System.out.println(8 / 5);
		System.out.println(10 / 5);
	}
	
		
	public static boolean makeBricks(int small, int big, int goal) {
	    int bigSum = big * 5;
	    
	    if(bigSum + small < goal){
	      return false;
	    }else{
	      return true;
	    }
	}
}