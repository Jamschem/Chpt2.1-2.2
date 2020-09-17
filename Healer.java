
public class Healer {
private String name;
private int lvl;
private int mhp;
private int hp;
private int atk;
private int def;
private int matk;
private int mdef;
private int spd;
private int wis;

	public Healer(String a) {
		name = a;
		lvl = 1;
		mhp = 16;
		hp = 16;
		atk = 4;
		def = 6;
		matk = 5;
		mdef = 10;
		spd = 3;
		wis = 12;
	}
	public Healer(String a, int lev) {
		name = a;
		lvl = 1*lev;
		mhp = 16*lev;
		hp = 16;
		atk = 4*lev;
		def = 6*lev;
		matk = 5*lev;
		mdef = 10*lev;
		spd = 3*lev;
		wis = 12*lev;
	
		
		
	}
}
