public class Lembrete {
    private String descricao;
    private DataData data;
    
    public Lembrete(String desc, DataData data){
        this.descricao = desc;
        this.data = data;
    }

    public void ajustarLembrete(String desc, DataData data){
        this.descricao = desc;
        this.data = data;
    }

    public String imprimirLembrete(){
        return String.format("%s às %s", descricao, data.mostrarData());
    }
}