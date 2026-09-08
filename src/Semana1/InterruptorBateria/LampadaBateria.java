public class LampadaBateria {
     // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean energizada;
    private Bateria bateria;
    /**
     * Construtor para objetos da classe Lâmpada
     */
    public LampadaBateria(Bateria bateria)
    {
        // inicializa variáveis de instância
        energizada = false;
        this.bateria = bateria;
    }

    public void atualizarEstado(boolean estado){
        if(estado==true){
            this.energizar();
            this.bateria.consumir();
        }
        else{
            this.degernizar();
        }
    }
    public void energizar(){
        if(bateria.temEnergia()){
            energizada = true;
        }
        else{
            this.degernizar();
        }
    }
    
    public void degernizar(){
        energizada = false;
    }

    public String showState(){
        if(this.energizada==true){
            return "ligada";
        }
        return "desligada";
    }
}
