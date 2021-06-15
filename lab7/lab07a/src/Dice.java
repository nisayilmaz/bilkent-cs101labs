
public class Dice {
    Die die1 = new Die();
    Die die2 = new Die();
    //consturctor
    public Dice(){
        Die die1 = new Die();
        Die die2 = new Die();
    }

    //methods
    public int roll(){
        die1.roll();
        die2.roll();
        return die1.getFaceValue() + die2.getFaceValue();
        
    }
    public int getDie1FaceValue(){
        return die1.getFaceValue();
    }
    public int getDie2FaceValue(){
        return die2.getFaceValue();
    }
    public int getDiceTotal(){
        return die1.getFaceValue() + die2.getFaceValue();
    }
    public String toString(){
        return "" + die1.getFaceValue() + " , " + die2.getFaceValue();
    }
}


