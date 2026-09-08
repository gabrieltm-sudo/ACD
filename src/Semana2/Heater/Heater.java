public class Heater {
    private double temperature;
    private double min;
    private double max;
    private double increment;
    
    public Heater(double min, double max){
        this.min = min;
        this.max = max;
        this.temperature = 15;
        this.increment = 5;
    }

    public void warmer(){
        double newTemperature = temperature-increment;

        if(newTemperature>max){
            System.out.println("[ERRO] The temperature would exceed the maximum limit.");      
        }
        else{
            temperature = newTemperature;
        }
    }

    public void cooler(){
        double newTemperature = temperature-increment;
        if(newTemperature<min){
            System.out.println("[ERRO] The temperature would fall bellow the minimum limit.");      
        }
        else{
            temperature = newTemperature;
        }
    }

    public double getTemp(){
        return temperature;
    }

    public void setIncrement(double increment){
        if(increment<0){
            System.out.println("[ERRO] Invalid increment value: must be positive.");
        }
        this.increment = increment;
    }
    
    public static void main(String[] args){
        Heater heater = new Heater(28, 10);

        System.out.println("Temperatura do aquecedor: " + heater.getTemp());

        heater.warmer();
        System.out.println("Temperatura do aquecedor: " + heater.getTemp());

        heater.cooler();
        heater.cooler();
        heater.cooler();
        System.out.println("Temperatura do aquecedor: " + heater.getTemp());
    }
}