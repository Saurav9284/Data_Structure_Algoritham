/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

	public boolean reverseCompare(ListNode head1, ListNode head2) {
		
		Stack <Integer> st1 = new Stack <>();
		Stack <Integer> st2 = new Stack <>();
		
		ListNode temp1 = head1;
		
		while(temp1!=null)
		{
		    st1.push(temp1.val);
		    temp1 = temp1.next;
		}
		
		ListNode temp2 = head2;
		
		while(temp2!=null)
		{
		    st2.push(temp2.val);
		    temp2 = temp2.next;
		}
		
		while(!st1.isEmpty() && !st2.isEmpty())
		{
		    if(st1.peek()<st2.peek())
		    {
		        return true;
		    }
		    else if(st2.peek()<st1.peek())
		    {
		        return false;
		    }
		    else
		    {
		        st1.pop();
		        st2.pop();
		    }
		}
		
		if(st1.isEmpty())
		{
		    return true;
		}
		else
		{
		    return false;
		}
	}
}
