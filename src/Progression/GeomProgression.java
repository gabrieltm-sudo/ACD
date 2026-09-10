public class GeomProgression extends Progression {
    protected long base;

    public GeomProgression(){
        this(2);
    }

    public GeomProgression(long base){
        this.base = base;
        super.first = 1;
        super.cur = first;
    }

    protected long nextValue(){
        return cur*=base;
    }

    protected void printProgression(int n){
        cur = firstValue();
        for(int i=0; i<n; i++){
            System.out.println(cur);
            cur = nextValue();   
        }
    }
}
