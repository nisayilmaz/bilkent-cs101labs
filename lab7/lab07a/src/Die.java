
public class Die{
    private int faceValue;
    //constructor
    public Die(){
        faceValue = (int)((Math.random() * 6 ) + 1);
    }
    public int roll(){
        faceValue = (int)((Math.random() * 6 ) + 1);
        return faceValue;
    }
    public int getFaceValue(){
        return faceValue;
    }
}