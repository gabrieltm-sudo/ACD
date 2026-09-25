import java.util.ArrayList;
public class Serial extends Circuit{
    private ArrayList<Circuit> circuits;    

    public Serial(ArrayList<Circuit> circuits){
        this.circuits = circuits;
    }
    
    public double getResistance(){
        double Resistance=0;
        for(Circuit i: circuits){
            Resistance+=i.getResistance();
        }
        return Resistance;
    }
}
