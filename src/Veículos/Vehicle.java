public class Vehicle {
    private int passengers;
    private double fuelCap;
    private double mpg;

    public Vehicle(int passengers, double fuelCap, double mpg){
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    public void setPassengers(int passengers){
        if(passengers>0){
            this.passengers = passengers;
        }
        else{
            this.passengers = 1;
        }
    }

    public int getPassengers(){
        return passengers;
    }

    public void setFuelCap(double fuelCap){
        this.fuelCap = fuelCap;
    }

    public double getFuelCap(){
        return fuelCap5
    }

    public void setMpg(double mpg){
        this.mpg = mpg;
    }

    public double getMpg(){
        return mpg;
    }
}