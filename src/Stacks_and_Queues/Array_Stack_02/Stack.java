package Stacks_and_Queues.Array_Stack_02;

public interface Stack<E> {

    int getSize();//O(1)
    boolean isEmpty();//O(1)
    void push(E e);//O(1)均摊 触发resize
    E pop();//O(1)均摊
    E peek();//O(1)
}
