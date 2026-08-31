public class Lembrete {
    private String descricao;
    private Data data;
    
    public Lembrete(String desc, Data data){
        this.descricao = desc;
        this.data = data;
    }

    public void ajustarLembrete(String desc, Data data){
        this.descricao = desc;
        this.data = data;
    }

    public String imprimirLembrete(){
        return String.format("%s às %s", descricao, data.mostrarData());
    }
}