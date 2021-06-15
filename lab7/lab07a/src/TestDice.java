
public class TestDice {
    public static void main(String[] args){
        Dice dice = new Dice();
        dice.roll();
        System.out.println( dice.getDie1FaceValue());
        System.out.println( dice.getDie2FaceValue());
        System.out.println( dice.getDiceTotal());
        System.out.println( dice.toString());
    }
    
}
