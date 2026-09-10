public class ArithProgression extends Progression {
    protected long inc;

    public ArithProgression(){
        this(1);
    }

    public ArithProgression(long inc){
        this.inc = inc;
    }

    protected long nextValue(){
        return cur+=inc;
    }

    protected void printProgression(int n){
        cur = firstValue();
        for(int i=0; i<n; i++){
            System.out.println(cur);
            cur = nextValue();   
        }
    }
}
