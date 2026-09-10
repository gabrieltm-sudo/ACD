public abstract class Progression {
    protected long first;   // first
    protected long cur; // current

    public Progression(){
        cur = first = 0;
    }

    protected long firstValue(){
        return first;
    }

    protected long nextValue(){
        return ++cur;
    }

    protected abstract void printProgression(int n);
}
