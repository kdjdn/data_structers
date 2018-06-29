package Stacks_and_Queues.More_about_Leetcode_04;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
