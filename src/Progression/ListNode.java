public class ListNode<T>{
    T data;
    ListNode<T> nextNode;

    public ListNode(T object){
        this(object, null);
    }

    public ListNode(T object, ListNode<T> node){
        this.data = object;
        this.nextNode = node;
    }

    public T getObject(){
        return data;
    }

    public ListNode<T> getNext(){
        return nextNode;
    }
}
