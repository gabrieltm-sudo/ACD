import java.util.Vector;

public class InterruptorBateria{
    private Vector<LampadaBateria> lampadas;
    
    public InterruptorBateria(){
        this.lampadas = new Vector<LampadaBateria>();
    }
    
    public void adicionarLampada(LampadaBateria lampada){
        this.lampadas.add(lampada);
    }
    
    public void ligar(){
        for(LampadaBateria i: lampadas){
            i.atualizarEstado(true);
            //i.energizar();
        }
    }
    
    public void desligar(){
        for(LampadaBateria i: lampadas){
            i.atualizarEstado(false);
            //i.degernizar();
        }
    }

    public void mostrarEstado(){
        int j = 0;
        for(LampadaBateria i: lampadas){
            System.out.println("Lampada "+ (j+1) +": " + i.showState());
            j++;
        }
    }
}
