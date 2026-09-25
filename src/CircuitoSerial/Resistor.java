public class Resistor extends Circuit{
    private double resistor;
    
    public Resistor(double resistor){
        this.resistor = resistor;
    }
    
    public void setResistance(double resistor){
        this.resistor = resistor;
    }
    
    public double getResistance(){
        return resistor;
    }   
}
