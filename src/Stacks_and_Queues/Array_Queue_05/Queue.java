package Stacks_and_Queues.Array_Queue_05;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);//添加元素，从末尾
    E dequeue();//从头取出元素
    E getFront();
}
