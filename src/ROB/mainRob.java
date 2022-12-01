package ROB;

import java.util.Scanner;

public class mainRob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int c;
		
		robot D2R2 = new robot("Steph");
	    System.out.print("vous avez "+D2R2.getPV()+" point de vie \n");
	    
	    robot Data = new robot("Zack");
	    System.out.println("vous avez "+Data.getPV()+" point de vie ");
	    D2R2.Fire(Data);
	    D2R2.isDead(Data);
	    Data.Fire(D2R2);
	    Data.Fire(D2R2);
	}
}