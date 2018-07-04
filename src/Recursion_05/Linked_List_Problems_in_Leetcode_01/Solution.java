package Recursion_05.Linked_List_Problems_in_Leetcode_01;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/**
 * 删除链表里面给定val的值
 * 不用虚拟头结点
 */
class Solution {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){//如果head里的值就是val，下一个头结点的值还是val
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;//删除了head节点
        }

        if(head == null)//所有的节点都删除了
            return head;

        //删除链表中间的val
        ListNode prev = head;//待删除元素前一个节点
        while(prev.next != null){
            if(prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }
            else
                prev = prev.next;
        }

        return head;
    }
}