
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] Args){
        Lampada lampA = new Lampada("lampA");
        lampA.energizar();
        lampA.mostrarEstado();
        lampA.degernizar();
        lampA.mostrarEstado();
    }
}