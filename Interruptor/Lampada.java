
/**
 * 
 * @author Gabriel Torres Machado 
 * @version 23/08/2026
 */
public class Lampada
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean energizada;
    private String nome;
    /**
     * Construtor para objetos da classe Lâmpada
     */
    public Lampada(String lampNome)
    {
        // inicializa variáveis de instância
        energizada = false;
        nome = lampNome;
    }

    public void energizar(){
        energizada = true;
    }
    
    public void degernizar(){
        energizada = false;
    }
    
    public boolean mostrarEstado(){
        if(energizada==true){
            System.out.println("A lâmpada " + nome +  " está energizada!");
        }
        else{
            System.out.println("A lâmpada " + nome + " está degernizada!");
        }
        return energizada;
    }
}