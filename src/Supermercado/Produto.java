public class Produto{
    protected Descrição descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(Descrição descricao, double preco, int quantidadeEstoque) {
        this.descricao = descricao;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }
    
    public void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }
    }

    public double getPreco(){
        return this.preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        if(quantidadeEstoque>=0){
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }

    public String getDescricao(){
        return String.format("%s", descricao);
    }
}
