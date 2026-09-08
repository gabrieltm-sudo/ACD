public class ContaBancariaSimplificada {
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEhEspecial;

    public void abreConta(String nome, double deposito, boolean ehEspecial){
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEhEspecial = ehEspecial;
    }

    public void abreContaSimples(String nome){
        nomeDoCorrentista = nome;
    }
    
    public void deposito(double valor){
        saldo+=valor;
    }

    public void saque(double valor){
        saldo-=valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean adicionaRendimentos(){
        if(contaEhEspecial==true){
            saldo*=1.015;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String mostraDados(){
        return String.format("Proprietário da conta: %s | Saldo na conta: R$%.2f | Tipo de conta: %s", nomeDoCorrentista, saldo, contaEhEspecial ? "Especial" : "Simples");
    }
}