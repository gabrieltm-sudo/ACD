public class Main {
    public static void main(String[] args){
        InterruptorBateria interruptor = new InterruptorBateria();

        Bateria bateria = new Bateria(80);
        LampadaBateria lampada = new LampadaBateria(bateria);
        interruptor.adicionarLampada(lampada);
        interruptor.mostrarEstado();
        interruptor.ligar();
        System.out.println("Bateria: "+ bateria.Carga());
        System.out.print("\n");

        LampadaBateria lampada2 = new LampadaBateria(bateria);
        interruptor.adicionarLampada(lampada2);
        interruptor.mostrarEstado();
        System.out.println("Bateria: "+ bateria.Carga());
        System.out.print("\n");
        
        interruptor.ligar();

        LampadaBateria lampada3 = new LampadaBateria(bateria);
        interruptor.adicionarLampada(lampada3);
        interruptor.mostrarEstado();
        System.out.println("Bateria: "+ bateria.Carga());
        System.out.print("\n");

        interruptor.ligar();
        interruptor.desligar();

        interruptor.mostrarEstado();
        System.out.print("\n");
    }
}
