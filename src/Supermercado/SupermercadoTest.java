import java.util.Scanner;
public class SupermercadoTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opt;

        Cliente cliente = null;
        Pedido pedido = null;
        Item[] itensPedido = null; 

        Produto arroz = new Produto(Descrição.ARROZ, 25, 100);
        Produto feijao = new Produto(Descrição.FEIJÃO, 10, 100);
        Produto farinha = new Produto(Descrição.FARINHA, 5, 100);
        Produto leite = new Produto(Descrição.LEITE, 5.99, 100);
        
        do{
            Menu();
            System.out.print("Selecione uma das opções acima: ");
            opt = scan.nextInt();
            
            System.out.println("==================================");

            switch(opt){
                case 1:
                    System.out.print("Insira o nome do cliente: ");
                    String nome = scan.next();
                    
                    System.out.print("Insira o CPF do cliente:");
                    String CPF = scan.next();

                    cliente = new Cliente(nome, CPF);

                    System.out.print("Insira a quantidade de itens no pedido: ");
                    int qntdItens = scan.nextInt();
                    
                    itensPedido = new Item[qntdItens];

                    for(int i=0; i<qntdItens; i++){
                        int item;

                        do{
                            System.out.print("Insira o produto (1- Arroz, 2- Feijão, 3- Farinha, 4- Leite): ");
                            item = scan.nextInt();
                        }while(item<1 || item>4);

                        System.out.print("Insira a quantidade desejada: ");
                        int qntdProduto = scan.nextInt();

                        Produto produtoAtual = null;
                        switch(item){
                            case 1:
                                produtoAtual = arroz;
                                break;
                            case 2:
                                produtoAtual = feijao;
                                break;
                            case 3:
                                produtoAtual = farinha;
                                break;
                            case 4:
                                produtoAtual = leite;
                                break;
                        }

                        if (produtoAtual.getQuantidadeEstoque()>=qntdProduto) {
                            produtoAtual.setQuantidadeEstoque(produtoAtual.getQuantidadeEstoque() - qntdProduto);
                            itensPedido[i] = new Item(qntdProduto, produtoAtual);
                        } else {
                            System.out.println("[ ERRO ] Estoque insuficiente de " + produtoAtual.getDescricao() + ". Estoque atual: " + produtoAtual.getQuantidadeEstoque());
                            itensPedido[i] = new Item(0, produtoAtual);
                        }
                    }
                    pedido = new Pedido();
                    pedido.setTipoPagamento(null, itensPedido);
                    System.out.println("Pedido criado com sucesso para: " + cliente.getNome());
                    break;
                case 2:
                    if(pedido==null || itensPedido == null){
                        System.out.println("[ERRO] Não há pedido atualmente.");
                        break;
                    }

                    double total = pedido.calcularTotal();
                    System.out.printf("Total do pedido: R$%.2f", total);

                    int tipoPagamento;
                    do{
                        System.out.println("Selecione a forma de pagamento (1- Dinheiro, 2- Chegue, 3- Cartão, 4- PIX)");
                        tipoPagamento = scan.nextInt();
                    }while(tipoPagamento<1 || tipoPagamento>4);

                    TipoPagamento pagamento = null;
                    switch(tipoPagamento){
                        case 1:
                            pagamento = TipoPagamento.DINHEIRO;
                            break;
                        case 2:
                            pagamento = TipoPagamento.CHEQUE;
                            break;
                        case 3:
                            pagamento = TipoPagamento.CARTÃO;
                            break;
                        case 4:
                            pagamento = TipoPagamento.PIX;
                            break;
                    }
                    
                    pedido.setTipoPagamento(pagamento, itensPedido);

                    System.out.println("\n=== Resumo da Compra ===");
                    System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCPF());
                    System.out.printf("Valor Pago: R$ %.2f\n", pedido.calcularTotal());
                    System.out.println("Método: " + pedido.getTipoPagamento());
                    System.out.println("=======================\n");

                    pedido = null;
                    cliente = null;
                    itensPedido = null;
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, selecione uma das opções válidas.");
                    break; 
            }
        }while(opt!=0);
        scan.close();
    }
    
    public static void Menu(){
        System.out.println("==================================");
        System.out.println("1- Novo pedido\n2- Realizar pagamento\n0- Sair da aplicação\n");
    }
}
