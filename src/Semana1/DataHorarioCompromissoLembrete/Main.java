public class Main {
    public static void main(String[] args){
        Horário hora = new Horário(17, 0);
        DataData data = new DataData(5, 10, 2026);
        String desc = "Reunião de atualização - PET-Saúde";
        Compromisso compromisso = new Compromisso(desc, data, hora);

        Lembrete lembrete = new Lembrete(desc, data);
        System.out.println(lembrete.imprimirLembrete());
        
        System.out.println(compromisso.imprimirCompromisso());
        
        System.out.println("=======================================\n");
        
        hora = new Horário(15, 35);
        data = new DataData(10, 9, 2026);
        desc = "Planejamento Kanban - PI3";
        compromisso = new Compromisso(desc, data, hora);

        lembrete = new Lembrete(desc, data);
        System.out.println(lembrete.imprimirLembrete());

        System.out.println(compromisso.imprimirCompromisso());

        System.out.println("=======================================\n");
    }
}
