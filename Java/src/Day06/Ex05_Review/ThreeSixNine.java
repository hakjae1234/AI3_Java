package Day06.Ex05_Review;

public class ThreeSixNine {
public static void main(String[] args) {
		
		int ten = i / 10;
		int one = i % 10;
		
		//
		
		boolean ten369 = ten == 3 || ten == 6 || ten == 9;
		boolean one369 = one == 3 || one == 6 || one == 9;
		
		
		// 3 6 9
		if( ten369 && one369 )
			System.out.println("**");
		else if( ten369 || one369)
			System.out.println("*");
		else
			System.out.println(i);
		

	


}
	
}
