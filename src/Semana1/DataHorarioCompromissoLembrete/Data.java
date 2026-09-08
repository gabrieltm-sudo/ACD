public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static final int[] meses30Dias = {4, 6, 9, 11};

    // Construtor
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        boolean EhValido = EhValida(dia, mes, ano);
        
        if(EhValido==false){
            System.out.println("Data inválida!");
        }
        else{
            System.out.println("Data válida!");
        }
    }
    
    private boolean EhValida(int dia, int mes, int ano){        
        if(dia<=0 || dia>31){ // dia inválido
            return false;
        }
        else if(mes<=0 || mes>12){ // mês inválido
            return false;
        }
        else if(mes==2){ // 29 de fevereiro
            if(dia==29 && (ano%4!=0 || ano%100==0 && ano%400!=0)){ // Não é ano bissexto
                return false;
            }
            else if(dia>=30){
                return false;
            }
        }
        else if(dia==31 && mes30Dias(mes)){
            return false;
        }
        
        return true;
    }
    
    private boolean mes30Dias(int tempMes){
        for(int i=0; i<meses30Dias.length; i++){
            if(meses30Dias[i]==tempMes){
                return false;
            }
        }
        return true;
    }
    
    public String mostrarData(){    // Ajustar estrutura do método - OK
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    
    public void ajustarData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
