public class Number extends Expression{
    private double value;

    public Number(double value){
        this.value = value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public double evaluate(){
        return value;
    }
    
}
