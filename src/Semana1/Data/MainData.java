import java.util.Scanner;

public class MainData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DataData data = new DataData(29, 12, 2026);
        
        data.mostrarData();
        
        System.out.println("Deseja modificar a data? (1- Sim, 2- Não)");
        
        int opt = scan.nextInt();
            
        switch(opt){
            case 1:
                System.out.print("Insira o novo dia: ");
                int dia = scan.nextInt();
                
                System.out.print("Insira o novo mês: ");
                int mes = scan.nextInt();
                
                System.out.print("Insira o novo ano: ");
                int ano = scan.nextInt();
                
                data.ajustarData(dia, mes, ano);
                
                break;
        }
        scan.close();
        
        System.out.println("Nova data: " + data.mostrarData());
    }
}
