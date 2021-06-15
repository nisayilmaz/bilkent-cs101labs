
public class DiceGame {
    Dice dice = new Dice();
    //constructor
    public DiceGame(){
        Dice dice = new Dice();
    }
    public int play(){
        int loopCounter = 0;
        do {
            dice.roll();
            System.out.println( dice.getDie1FaceValue() +  " , " + dice.getDie2FaceValue() );
            loopCounter = loopCounter + 1;
        } while (!(dice.getDiceTotal() == 12));
        return loopCounter;
    }
    
}
