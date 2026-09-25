import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Circuit resistor1 = new Resistor(300);
        Circuit resistor2 = new Resistor(500);
        Circuit resistor3 = new Resistor(1200);
        
        ArrayList<Circuit> circuits = new ArrayList<>();
        circuits.add(resistor1);
        circuits.add(resistor2);
        circuits.add(resistor3);

        Circuit serialCircuit = new Serial(circuits);
        System.out.println("O circuito serial 1 possui uma resistência equivalente de " + serialCircuit.getResistance() + " Ohms");
        
        Circuit resistor4 = new Resistor(10);
        Circuit resistor5 = new Resistor(10);
        Circuit resistor6 = new Resistor(10);
        
        ArrayList<Circuit> circuits2 = new ArrayList<>();
        circuits2.add(resistor4);
        circuits2.add(resistor5);
        circuits2.add(resistor6);
        circuits2.add(serialCircuit);

        Circuit serialCircuit2 = new Serial(circuits2);
        System.out.println("O circuito serial 2 possui uma resistência equivalente de " + serialCircuit2.getResistance() + " Ohms");

        Circuit resistor7 = new Resistor(50);
        Circuit resistor8 = new Resistor(100);
        Circuit resistor9 = new Resistor(300);

        ArrayList<Circuit> circuits3 = new ArrayList<>();
        circuits3.add(resistor7);
        circuits3.add(resistor8);
        circuits3.add(resistor9);

        Circuit parallelCircuit = new Parallel(circuits3);
        System.out.println("O circuito paralelo 1 possui uma resistência equivalente de " + parallelCircuit.getResistance() + " Ohms");

        Circuit resistor10 = new Resistor(50);
        Circuit resistor11 = new Resistor(100);
        Circuit resistor12 = new Resistor(300);

        ArrayList<Circuit> circuits4 = new ArrayList<>();
        circuits4.add(resistor10);
        circuits4.add(resistor11);
        circuits4.add(resistor12);
        circuits4.add(parallelCircuit);

        Circuit parallelCircuit2 = new Parallel(circuits4);
        System.out.println("O circuito paralelo 2 possui uma resistência equivalente de " + parallelCircuit2.getResistance() + " Ohms");

    }
}
