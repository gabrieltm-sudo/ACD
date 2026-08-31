public class Compromisso {
    private String descricao;
    private Data data;
    private Horário hora;

    public Compromisso(String desc, Data data, Horário hora){
        this.descricao = desc;
        this.data = data;
        this.hora = hora;
    }

    public void ajustarCompromisso(String desc, Data data, Horário hora){
        this.descricao = desc;
        this.data = data;
        this.hora = hora;
    }

    public String imprimirCompromisso(){
        String horaFormat = hora.imprimirHorário();
        String dataFormat = data.mostrarData();
        
        return String.format("Dia: %s%nHorário: %s%nDescrição: %s", dataFormat, horaFormat, descricao);
    }
}
