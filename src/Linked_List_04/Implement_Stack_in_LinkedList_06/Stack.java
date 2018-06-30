package Linked_List_04.Implement_Stack_in_LinkedList_06;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
