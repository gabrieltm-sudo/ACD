public class Truck extends Vehicle {
    private double cargoCap;

    public Truck(int passengers, double fuelCap, double mpg, double cargoCap){
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }
    
    public void setCargoCap(double cargoCap){
        this.cargoCap = cargoCap;
    }

    public double getCargoCap(){
        return cargoCap;
    }

    public String toString(){
        return String.format("Tipo de veículo: %s | Quantidade máxima de passageiros: %d | Capacidade máxima de combustível: %.2fL | Milhas por galão: %.2f | Capacidade de carga: %.2fKg", "Caminhão", this.getPassengers(), this.getFuelCap(), this.getMpg(), cargoCap);
    }
}