public class Pedido {
    protected TipoPagamento pagamento;
    protected Item[] itens;


    public void setTipoPagamento(TipoPagamento pagamento, Item[] itens){
        this.itens = itens;
        this.pagamento = pagamento;
    }

    public String getTipoPagamento(){
        return String.format("%s", pagamento);
    }

    public double calcularTotal(){
        double total = 0;
        if(itens!=null){
            for(Item item: itens){
                if(item!=null && item.getProduto()!=null){
                    total+=item.getQuantidade()*item.produto.getPreco();
                }
            }
        }

        return total;
    }

}
