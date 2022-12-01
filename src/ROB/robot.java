package ROB;
import java.util.Scanner;
public class robot {
	private String nom;
	private String nom1;
	private int PV;
	private int PV1;
	private int PA=10;
	private boolean setPV1;
	
	public robot(String nom) {
		this.setNom(nom, nom);
		this.setPV(10);
		this.setPA(20);
	}
	
	public void degats(int degats) {
	this.setPV(this.getPV() - degats);
	System.out.println("Vous avez perdu"+degats+"point de vie");
	}
	
	public void Fire(robot roattaque) {
		int c;
		robot a = new robot("Zack");
		robot b = new robot("Steph");
		while(a.getPV()!=0 && b.getPV()!=0) {
	    	System.out.print("\n quel robot attaque ? 1 ou 2 : ");
	    	Scanner s = new Scanner(System.in);
		    c = s.nextInt();
		if (roattaque.getPV1()<=0) {
			System.out.println(roattaque.getNom()+" est déjà mort");
		}
		else if (roattaque.getPV()<=0){
		System.out.println(roattaque.getNom1()+"est déjà mort");	
		}
		if(roattaque.setPV1) {
			roattaque.setPV1(roattaque.getPV1() -2);
			System.out.println(roattaque.getNom()+" a été touché par le robot "+this.nom);
			System.out.println(" Oh "+roattaque.getNom()+" il reste "+roattaque.getPV1());
		}
		else {
			roattaque.setPV(roattaque.getPV() -2);
			System.out.println(roattaque.getNom1()+" a été touché par le robot "+this.nom1);
			System.out.println(" Oh "+roattaque.getNom1()+" il reste "+roattaque.getPV());
		}
	}
}
	
	private String getNom() {
		return nom;
	}

	private int getPV1() {
		return PV1;
	}

	public void isDead(robot ro) {
		robot a = new robot("Zack");
		robot b = new robot("Steph");
		if(a.getPV()==0) System.out.print(a.getNom()+" vous etes mort");
		else if(b.getPV()==0) System.out.print(b.getNom()+" vous etes mort");  
	}

	public int getPV() {
		return PV;
	}

	public void setPV(int PV) {
		this.PV = PV;
	}
	
	public void setPV1(int PV1) {
		this.PV1=PV1;
	}

	public String getNom1() {
		return nom1;
	}

	public void setNom(String nom, String nom1) {
		this.nom = nom;
		this.nom1=nom1;
	}

	public int getPA() {
		return PA;
	}

	public void setPA(int PA) {
		this.PA = PA;
	}
	
	}

