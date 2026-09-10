public enum Descrição {
    ARROZ(1), 
    FEIJÃO(2), 
    FARINHA(3), 
    LEITE(4);
    
    private final int id;

    Descrição(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}