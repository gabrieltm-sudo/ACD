public class Main{
    public static void main(String[] args){
        Lampada lampada = new Lampada("A");
        Interruptor interruptor = new Interruptor(lampada);
        
        lampada.mostrarEstado();
        
        interruptor.fecharCircuito();
        lampada.mostrarEstado();
        
        interruptor.abrirCircuito();
        lampada.mostrarEstado();
    }
}