package com.gjh6.java.review.arithmetic.list;

/**
 * @author Gong.Junhao
 * @version V1.0
 * @program: note
 * @Description: 待完善 有bug
 * @Package com.gjh6.java.review.arithmetic.list
 * @date 2019/11/28 15:34
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = removeNthFromEnd(listNode1, 4);
        System.out.println("头部："+listNode.val);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 0;
        ListNode node = head;
        while(node != null) {
            if(index == n){
                node.val = node.next.val;
                node.next = node.next.next;
                break;
            } else {
                node = node.next;
                index++;
            }
            if(index == 0) {
                head = node;
            }
        }
        return head;
    }


     //Definition for singly-linked list.
     static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
}
