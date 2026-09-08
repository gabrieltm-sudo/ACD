import java.util.Scanner;

public class ContaBancariaAPP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ContaBancariaSimplificada contas[] = new ContaBancariaSimplificada[10];

        int opt, qntdContas=0;
        do{
            System.out.println("\n=========================================\n");
            System.out.println("1- Abrir Conta Especial");
            System.out.println("2- Abrir Conta Simples");
            System.out.println("3- Depósito");
            System.out.println("4- Saque");
            System.out.println("5- Adicionar Rendimentos");
            System.out.println("6- Mostrar Dados da(s) Conta(s)");
            System.out.println("0- Sair do programa");
            
            System.out.print("\nSelecione uma das opções acima: ");
            opt = scan.nextInt();
            
            System.out.println("\n=========================================\n");

            scan.nextLine(); // Limpa buffer
            
            switch(opt){
                case 0:
                    System.out.println("Saindo do programa...");
                    scan.close();
                    System.exit(0);
                    break;
                case 1:
                    if(qntdContas>=10){
                        System.out.println("[ERRO] Número máximo de contas criadas!");
                    }
                    else{
                        System.out.print("Insira o nome do proprietário da conta: ");
                        String nome = scan.nextLine();

                        System.out.print("Insira o saldo da conta: ");
                        double saldo = scan.nextDouble();

                        contas[qntdContas] = new ContaBancariaSimplificada();
                        contas[qntdContas].abreConta(nome, saldo, true);
                        qntdContas++;
                    }
                    break;
                case 2:
                    if(qntdContas>=10){
                        System.out.println("[ERRO] Número máximo de contas criadas!");
                    }
                    else{
                        System.out.print("Insira o nome do proprietário da conta: ");
                        String nome = scan.nextLine();

                        contas[qntdContas] = new ContaBancariaSimplificada();
                        contas[qntdContas].abreContaSimples(nome);
                        qntdContas++;
                    }
                    break;
                case 3:
                    if(qntdContas==0){
                        System.out.println("[ERRO] Não há nenhuma conta criada ainda!");
                    }
                    else{
                        int contaNum;
                        do{
                            System.out.print("Insira o número da conta para depósito: ");
                            contaNum = scan.nextInt();
                            
                            if(contaNum<0 || contaNum>=qntdContas){
                                System.out.println("\n[ERRO] Conta inválida! Por favor, insira uma conta válida.\n");
                            }
                        }while(contaNum<0 || contaNum>=qntdContas);
                        
                        System.out.print("Insira a quantidade do depósito: ");
                        double valor = scan.nextDouble();

                        contas[contaNum].deposito(valor);                       
                    }
                    break;
                case 4:
                    if(qntdContas==0){
                        System.out.println("[ERRO] Não há nenhuma conta criada ainda!");
                    }
                    else{
                        int contaNum;
                        do{
                            System.out.print("Insira o número da conta para saque: ");
                            contaNum = scan.nextInt();
                            
                            if(contaNum<0 || contaNum>=qntdContas){
                                System.out.println("\n[ERRO] Conta inválida! Por favor, insira uma conta válida.\n");
                            }
                        }while(contaNum<0 || contaNum>=qntdContas);
                        
                        System.out.print("Insira a quantidade do saque: ");
                        double valor = scan.nextDouble();

                        if(contas[contaNum].getSaldo()<=valor){
                            System.out.println("\n[ERRO] Valor de saque inválido (maior que saldo).\n");
                        }
                        else{
                            contas[contaNum].saque(valor);
                        }
                    }
                    break;
                case 5:
                    if(qntdContas==0){
                        System.out.println("[ERRO] Não há nenhuma conta criada ainda!");
                    }
                    else{
                        int contaNum;
                        do{
                            System.out.print("Insira o número da conta para adicionar rendimento: ");
                            contaNum = scan.nextInt();
                            
                            if(contaNum<0 || contaNum>=qntdContas){
                                System.out.println("\n[ERRO] Conta inválida! Por favor, insira uma conta válida.\n");
                            }
                        }while(contaNum<0 || contaNum>=qntdContas);
                        
                        boolean ehEspecial = contas[contaNum].adicionaRendimentos();

                        if(ehEspecial==true){
                            System.out.printf("Novo saldo da conta " + contaNum + ": R$%.2f\n", contas[contaNum].getSaldo());
                        }
                        else{
                            System.out.println("[ERRO] A conta escolhida não é especial.");
                        }
                    }
                    break;
                case 6:
                    if(qntdContas==0){
                        System.out.println("[ERRO] Não há nenhuma conta criada ainda!");
                    }
                    else{

                        for(int i=0; i<qntdContas; i++){
                            System.out.println(contas[i].mostraDados());
                        }
                    }
                    break;
                default:
                    System.out.println("[ERRO] Opção inválida! Por favor, selecione uma das opções disponíveis.");
                    break;
            }
            
        }while(opt!=0);
    }
}
