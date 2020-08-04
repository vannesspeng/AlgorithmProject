package com.vanness.leecode;

/**
 * Created by pyy on 2019/11/25.
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class NO2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //声明进位数
        int carry = 0;
        //声明一个哑节点，这样便于记录链表的头结点
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead, p1 = l1, p2 = l2;

        while(p1 !=null || p2 != null){
            int sum = 0;
            if(p1 != null){
                sum += l1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            //l1,l2两个节点的数值相加，再加上前一位的进位数
            sum += carry;
            //取模获取当前位的值
            curr.next = new ListNode(sum % 10);
            //除以10更新进位carry的值
            carry = sum / 10;

            //curr指向当前节点
            curr = curr.next;
        }
        //判断最后进位是否为0
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}