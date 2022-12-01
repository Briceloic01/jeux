package ROBOT;
import java.util.Scanner;
public class mainR {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int c;
		
		Robot D2R2 = new Robot("happi");
	    System.out.print("vous avez "+D2R2.getPv()+" point de vie \n");
	    
	    Robot Data = new Robot("jean");
	    System.out.println("vous avez "+Data.getPv()+" point de vie ");
	    D2R2.fire(Data);
	    D2R2.isDead(Data);

	}

}
