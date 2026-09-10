public class FibonacciProgression extends Progression{
    protected long prev;

    public FibonacciProgression(){
        this(0, 1);
    }

    public FibonacciProgression(long v1, long v2){
        super.first = v1;
        this.prev = v2-v1;
    }

    protected long nextValue(){
        long temp = prev;
        prev = cur;
        cur+=temp;
        return cur;
    }

    protected void printProgression(int n){
        cur = firstValue();
        for(int i=0; i<n; i++){
            System.out.println(cur);
            cur = nextValue();   
        }
    }
}
