public class Cliente {
    private String nome;
    private String CPF;
    protected Pedido pedido;

    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.CPF;
    }
}
