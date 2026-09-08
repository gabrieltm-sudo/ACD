public class MainInterruptor{
    public static void main(String[] args){
        LampadaInterruptor lampada = new LampadaInterruptor("A");
        Interruptor interruptor = new Interruptor(lampada);
        
        lampada.mostrarEstado();
        
        interruptor.fecharCircuito();
        lampada.mostrarEstado();
        
        interruptor.abrirCircuito();
        lampada.mostrarEstado();
    }
}