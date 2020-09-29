public class Burglar extends Player{
	protected int ap;
	private static final int baseAP=1;
		Burglar(String pname, String cname){
			super(pname,cname);
			ap=baseAP;
		}
		Burglar(String pname, String cname, int level, int xp, int hp, int ap){
			super(pname,cname,level,xp,hp);
			this.ap=ap;
		}
		public void gainXP(int value){
			this.xp+=value;
			if (this.xp*this.level>this.level*1000) {
				level+=1;
				ap+=1;
				hp+=8;
			}
		}
		public boolean disableTrap(int trapDifficulty){
			if (this.ap*level>trapDifficulty) {
				System.out.println("Trap disabled");
				return true;
			}
			else{
				System.out.println("Trap activated");
				this.hp-=10;
				return false;
			}
		}
		public String toString(){
			String result=super.toString();
			result+="\nCharacter type: Burglar\nAgility Power: "+ap;
			return result;
		}
}