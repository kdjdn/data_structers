package Stacks_and_Queues.Implementation_of_Loop_Queue_07;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
