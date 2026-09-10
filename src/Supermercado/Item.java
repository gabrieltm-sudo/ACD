public class Item {
    private int quantidade;
    protected Produto produto;

    public Item(int quantidade, Produto produto){
        this.produto = produto;
        if(quantidade>0){
            this.quantidade = quantidade;
        }
        else{
            this.quantidade = 0;
        }
    }

    public void setQuantidade(int quantidade){
        if(quantidade>=0){
            this.quantidade = quantidade;
        }
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public String getProduto(){
        return String.format("%s", produto);
    }

}
