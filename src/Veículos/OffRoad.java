public class OffRoad extends Vehicle{
    private double groundClearance;

    public OffRoad(int passengers, double fuelCap, double mpg, double groundClearance){
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }

    public void setGroundClearance(double groundClearance){
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance(){
        return groundClearance;
    }
    
    public String toString(){
        return String.format("Tipo de veículo: %s | Quantidade máxima de passageiros: %d | Capacidade máxima de combustível: %.2fL | Milhas por galão: %.2f | Distância entre o veículo e o solo: %.2fcm", "Off-Road", this.getPassengers(), this.getFuelCap(), this.getMpg(), groundClearance);
    }
}