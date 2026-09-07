import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vehicle Veiculo = null;
        int opt;

        do{
            Menu();

            opt = scan.nextInt();
            System.out.println("\n==================================================================================================\n");

            switch(opt){
                case 0:
                    System.out.println("Encerrando programa...");
                    System.exit(0);
                    break;
                case 1:
                    do{
                        System.out.print("Escolha o tipo do novo veículo (1- Truck. 2- Off-Road): ");
                        opt = scan.nextInt();
                    }while(opt<1 || opt>2);

                    int passengers;
                    double fuelCap, mpg;

                    System.out.print("Insira a capacidade máxima de passageiros do veículo: ");
                    passengers = scan.nextInt();
                    
                    System.out.print("Insira a capacidade de combustível do veículo: ");
                    fuelCap = scan.nextDouble();

                    System.out.print("Insira a quantidade de milhas por galão que o veículo percorre: ");
                    mpg = scan.nextDouble();

                    switch(opt){
                        case 1:
                            double cargoCap;
                            System.out.print("Insira a capacidade máxima de carga do veículo: ");
                            cargoCap = scan.nextDouble();

                            Veiculo = new Truck(passengers, fuelCap, mpg, cargoCap);
                            System.out.println(Veiculo.toString());
                            break;
                        case 2:
                            double groundClearance;

                            System.out.print("Insira a distância entre o veículo e o solo: ");
                            groundClearance = scan.nextDouble(); 

                            Veiculo = new OffRoad(passengers, fuelCap, mpg, groundClearance);
                            System.out.println(Veiculo.toString());
                            break;
                    }
                    break;
                case 2:
                    if(Veiculo==null){
                        System.out.println("Nenhum veículo criado ainda!");
                        break;
                    }

                    System.out.print("Insira a nova quantidade de passageiros: ");
                    int newPassengers = scan.nextInt();

                    Veiculo.setPassengers(newPassengers);
                    break;
                case 3:
                    if(Veiculo==null){
                        System.out.println("Nenhum veículo criado ainda!");
                        break;
                    }
                    System.out.print("Insira a nova capacidade máxima de combustível: ");
                    double newCapFuel = scan.nextDouble();

                    Veiculo.setFuelCap(newCapFuel);
                    break;
                case 4:
                    if(Veiculo==null){
                        System.out.println("Nenhum veículo criado ainda!");
                        break;
                    }

                    System.out.print("Insira o novo MPG: ");
                    double newMpg = scan.nextDouble();

                    Veiculo.setMpg(newMpg);
                    break;
                case 5:
                    if(Veiculo==null){
                        System.out.println("Nenhum veículo criado ainda!");
                        break;
                    }
                    if(Veiculo instanceof Truck){
                        System.out.print("Insira a nova capacidade de carga do caminhão: ");
                        double newCargoCap = scan.nextDouble();

                        Truck truck = (Truck) Veiculo;
                        truck.setCargoCap(newCargoCap);
                    }
                    else{
                        System.out.println("[ERRO] O veículo atual não é um caminhão.");
                    }
                    break;
                case 6:
                    if(Veiculo==null){
                        System.out.println("Nenhum veículo criado ainda!");
                        break;
                    }
                    if(Veiculo instanceof OffRoad){
                        System.out.print("Insira a nova distância entre o veículo e o solo: ");
                        double newGroundClarance = scan.nextDouble();

                        OffRoad offroad = (OffRoad) Veiculo;
                        offroad.setGroundClearance(newGroundClarance);
                    }
                    else{
                        System.out.println("[ERRO] O veículo atual não é um Off-Road.");
                    }
                    break;
            }
        }while(opt!=0);

        scan.close();
    }

    public static void Menu(){
        System.out.println("\n==================================================================================================\n");
        System.out.println("1- Criar novo veículo\n2- Modificar a quantidade máxima de passageiros do veículo\n3- Modificar a capacidade máxima de combustível do veículo\n4- Modificar o MPG do veículo\n5- Modificar a capacidade de carga do veículo (only Trucks)\n6- Modificar a distância entre o veículo e o solo (only Off-Roads)\n0- Sair do programa\n");

    }
}