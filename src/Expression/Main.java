import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opt;

        do{
            Menu();
            System.out.println("Escolha uma das opções acima: ");
            opt = scan.nextInt();
            
            System.out.println("=================================================\n");
            scan.nextLine();

            switch(opt){
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    System.out.println("Saindo do programa...\n");
                    scan.close();
                    System.exit(0);
            }
            
        }while(opt!=0);
    }

    public static void Menu(){
        System.out.println("=================================================\n");
        System.out.println("1- Adicionar número ou expressão na calculadora");
        System.out.println("2- Ver resultado");
        System.out.println("0- Sair do programa");
    }
}
