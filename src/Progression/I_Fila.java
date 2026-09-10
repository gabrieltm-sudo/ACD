public abstract interface I_Fila<T> {
    public void add(Object T);
    public T remove()  throws EmptyQueueException;
    public boolean isEmpty();
}
