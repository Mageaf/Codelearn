public class Main {
    public static void main (String[] args) {
       Warrior w1 = new Warrior ("Code1", "Tanis");
       Warrior w2 = new Warrior ("Code2", "Aragorn", 10, 20000, 100, 15, 15);

       Burglar b1 = new Burglar ("Code3", "Bilbo");
       Burglar b2 = new Burglar ("Code4", "Tasslehoff", 10, 20000, 100, 15);


       w1.gainXP(2000);
       w2.gainXP(2000);
       b1.gainXP(2000);
       b2.gainXP(2000);

       System.out.println(w1);
       System.out.println(w2);
       System.out.println(b1);
       System.out.println(b2);

       System.out.println("Tanis is attacking enemy with DP 5");
       w1.attack(10);
       System.out.println("Aragorn is attacking enemy with DP 5");
       w2.attack(10);

       System.out.println("Bilbo is trying to disable a trap of difficulty 5");
       b1.disableTrap(5);
       System.out.println("Tasslehoff is trying to disable a trap of difficulty 5");
       b2.disableTrap(5);

       System.out.println(b1);
       System.out.println(b2);



    }
}