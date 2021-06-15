
public class TestDie {
    public static void main(String[] args){
        Die die1 = new Die();
        Die die2 = new Die();
        //System.out.println(die); prints out Die@7637f22???
        die1.roll();
        die2.roll();
        System.out.println( die1.getFaceValue() + " , " + die2.getFaceValue());
        
    }
}
