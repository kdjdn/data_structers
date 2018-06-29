package Stacks_and_Queues.Queues_Comparison_08;

public interface Queue<E> {
//在排队中使用，比如网络数据包、操作系统任务等
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
