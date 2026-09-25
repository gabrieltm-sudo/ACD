import java.util.ArrayList;
public class Parallel extends Circuit{
    private ArrayList<Circuit> circuits;

    public Parallel(ArrayList<Circuit> circuits){
        this.circuits = circuits;
    }

    public double getResistance(){
        double resistance=0;
        for(Circuit i: circuits){
            resistance += (1/(i.getResistance()));
        }
        resistance = 1/resistance;
        return resistance;
    }
}
