public class Bateria {
    private int carga;

    public Bateria(int carga){
        this.carga = carga;
    }

    public boolean temEnergia(){
        if(this.carga<=0){
            return false;
        }
        return true;
    }

    public void consumir(){
        this.carga-=10;
    }

    public int Carga(){
        return this.carga;
    }
}
