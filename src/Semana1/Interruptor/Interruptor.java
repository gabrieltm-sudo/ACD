/**
 * Escreva uma descrição da classe Interruptor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Interruptor{
    private LampadaInterruptor lampada;
    
    public Interruptor(LampadaInterruptor lampada){
        this.lampada = lampada;
    }
    
    public void fecharCircuito(){
        lampada.energizar();
    }
    
    public void abrirCircuito(){
        lampada.degernizar();
    }
}