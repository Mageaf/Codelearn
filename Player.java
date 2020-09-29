

    import java.util.Scanner;

public abstract class Player{
    protected String playerName;
    protected String characterName;
    protected int level;
    protected int xp;
    protected int hp;
    private static final int baseXP=0;
    private static final int baseLevel=1;
    private static final int baseHP=100;
    Player(String pname, String cname){
        this.playerName=pname;
        this.characterName=cname;
        level=baseLevel;
        xp=baseXP;
        hp=baseHP;
    }
    Player(String pname, String cname, int level, int xp, int hp){
        playerName=pname;
        characterName=cname;
        this.level=level;
        this.hp=hp;
        this.xp=xp;
    }
    public void gainXp(int value){

    }
    public String toString(){
        String result="Player Name: "+this.playerName+"\nCharacter Name: "+this.characterName+"\nCharacter Level: "+this.level+"\nCharacter XP: "+this.xp+"\nCharacter HP: "+this.hp;
        return result;
    }
}