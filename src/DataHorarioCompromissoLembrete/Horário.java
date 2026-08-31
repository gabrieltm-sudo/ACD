public class Horário {
    private int hora;
    private int min;
    
    public Horário(int hora, int min){
        boolean EhValido = horárioÉVálido(hora, min);
        
        if(EhValido==false){
            System.out.println("Horário inválido!");
            System.exit(0);
        }

        this.hora = hora;
        this.min = min;
    }

    private boolean horárioÉVálido(int hora, int min){
        if(hora<0 || hora>24){
            return false;
        }
        if(min<0 || min>60){
            return false;
        }

        return true;
    }

    public void ajustarHorário(int hora, int min){
        boolean EhValido = horárioÉVálido(hora, min);
        
        if(EhValido==false){
            System.out.println("Horário inválido!");
            System.exit(0);
        }

        this.hora = hora;
        this.min = min;
    }

    public String imprimirHorário(){
        return String.format("%dh%d", hora, min);
    }
}
