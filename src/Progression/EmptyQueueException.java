public class EmptyQueueException extends EmptyListException{
    public EmptyQueueException(){
        this("Erro genérico");
    }

    public EmptyQueueException(String name){
        super(name);
    }
}
