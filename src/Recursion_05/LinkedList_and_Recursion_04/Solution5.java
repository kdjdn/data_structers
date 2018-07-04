package Recursion_05.LinkedList_and_Recursion_04;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/
/**
 * 删除链表中val值元素
 * 用递归实现
 */
class Solution5 {

    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution5()).removeElements(head, 6);
        System.out.println(res);
    }
}