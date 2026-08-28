import java.util.Scanner;
// import java.util.Vector;

public class Lembrete {
    private String descricao;
    private /*Vector<*/Data/*>*/ data;
    
    public Lembrete(String desc, Data data){
        this.descricao = desc;
        this.data = data;
    }

    public void ajustarLembrete(String desc, Data data){
        this.descricao = desc;
        this.data = data;
    }

    public String imprimirLembrete(){
        return this.descricao;
    }
}