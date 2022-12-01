package ROBOT;
import java.util.Scanner;
public class Robot {
	private String nom;
	private int pv=10;
	private int pa;
	
	public Robot(String nom) {
		this.nom = nom;
		this.pv=10;
		this.pa=20;
		
    }
	public void damage(int damage) {
		this.pv -= damage;
		System.out.println(" il a perdu "+damage+ " point de vie");
	}
	
	public void fire(Robot R) {
		int c;
		Robot a = new Robot("happi");
		Robot b = new Robot("jean");
		while(a.getPv()!=0 && b.getPv()!=0) {
	    	System.out.print("\n quel robot attaque ? 1 ou 2 : ");
	    	Scanner s = new Scanner(System.in);
		    c = s.nextInt();
		    if(c==1) {
		    	System.out.print("\n"+a.getNom()+" attaque "+b.getNom() );
		    	b.damage(2);
		    	System.out.println("\n"+b.getNom()+" il vous reste "+b.getPv());
		    }else if(c==2){
		    	System.out.print("\n"+b.getNom()+" attaque "+a.getNom() );
		    	a.damage(2);
		    	System.out.println("\n"+a.getNom()+" il vous reste "+a.getPv());
		    }
	    }
	}
	
	public void isDead(Robot R) {
		Robot a = new Robot("happi");
		Robot b = new Robot("jean");
		if(a.getPv()==0) System.out.print(a.getNom()+" vous etez mort");
		else if(b.getPv()==0) System.out.print(a.getNom()+" vous etez mort"); 
		else System.out.print(" personne n'est mort"); 
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }
}

