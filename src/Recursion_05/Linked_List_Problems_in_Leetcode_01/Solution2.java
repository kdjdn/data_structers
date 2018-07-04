package Recursion_05.Linked_List_Problems_in_Leetcode_01;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/**
 * 删除链表里面给定val的值
 * 不用虚拟头结点
 */
class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val)//如果head里的值就是val，下一个头结点的值还是val
            head = head.next;

        if(head == null)
            return head;

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return head;
    }
}