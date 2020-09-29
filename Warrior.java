public class Warrior extends Player{
		protected int cp;
		protected int dp;
		private static final int baseCP=1;
		private static final int baseDP=1;
		Warrior(String pname, String cname){
			super(pname,cname);
			cp=baseCP;
			dp=baseDP;
		}
		Warrior(String pname, String cname, int level, int xp, int hp, int cp, int dp){
			super(pname,cname,level,xp,hp);
        	this.cp=cp;
        	this.dp=dp;
		}
		public void gainXP(int value){
			this.xp+=value;
			if (this.xp*this.level>this.level*1000*this.level/4) {
				level+=1;
				cp+=1;
				dp+=1;
				hp+=10;
			}
		}
		public boolean attack(int enemyDP){
			if (this.dp>enemyDP*2) {
				System.out.println("Attack succeeded");
				return true;
			}
			else{
				System.out.println("Attack failed");
				return false;
			}
		}
		public String toString(){
			String result=super.toString();
			result+="\nCharacter type: Warrior\nCombat Power: "+this.cp+"\nCombat Defense: "+dp;
			return result;
		}
}