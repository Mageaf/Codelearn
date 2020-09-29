public class Wizard extends Player{
	protected int mp;
	protected int mppoints;
	protected int availablemppoints;
	private static final int basemp=1;
	private static final int basemppoints=10;
		Wizard(String pname, String cname){
			super(pname,cname);
			mp=basemp;
			mppoints=basemppoints;
			availablemppoints=mppoints;
		}
		Wizard(String pname, String cname, int level, int xp, int hp, int mp, int mppoints){
			super(pname,cname,level,xp,hp);
        	this.mp=mp;
        	this.mppoints=mppoints;
        	this.availablemppoints=mppoints;
		}
				public void gainXP(int value){
			this.xp+=value;
			if (this.xp*this.level>this.level*1000*this.level/2) {
				level+=1;
				cp+=1;
				dp+=1;
				hp+=10;
			}
		}
}