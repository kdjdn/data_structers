package Linked_List_04.Implement_Queue_in_LinkedList_07;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
