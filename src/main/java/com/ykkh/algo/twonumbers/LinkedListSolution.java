package com.ykkh.algo.twonumbers;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	void setNext(ListNode next) {
		this.next = next;
	}
}

public class LinkedListSolution {
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		head1.setNext(node2);
		node2.setNext(node3);

		ListNode head2 = new ListNode(9);
		ListNode node5 = new ListNode(2);
		ListNode node6 = new ListNode(3);

		head2.setNext(node5);
		node5.setNext(node6);

		ListNode nd = addTwoNumbers2(head1, head2);
		System.out.println(nd);
		
		
		ListNode head3 = new ListNode();
		
		
		ListNode dummyHead = new ListNode(0);
		ListNode  curr = dummyHead;
		
		for(int i = 1; i<7; i++) {
			curr.next = new ListNode(i);
			curr = curr.next;
		}
		
		System.out.println(curr);

	}

	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode p = l1;
		ListNode q = l2;
		ListNode resultHead = new ListNode();
		ListNode temp = new ListNode();
		int carry = 0;
		while (p != null || q != null) {
			int sum = carry+p.val+q.val;
			if(sum>=10) {
				carry = 1;
				if(temp == null) {
				resultHead = new ListNode(sum-10, temp);
				} else {
					
				}
				
			} else {
				carry = 0;
				ListNode node = new ListNode(sum);
				temp.setNext(node);
			}
			p = p.next;
			q = q.next;
		}
		return resultHead;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;

	}
}