class Solution {
	
	public boolean evenOddMix(ListNode head) {
		
		ListNode temp = head;
		
		int count = 1;
		
		while(temp!=null)
		{
		    if(count%2!=0 && temp.val%2==0)
		    {
		        count++;
		        temp=temp.next;
		    }
		    else if(count%2==0 && temp.val%2!=0)
		    {
		        count++;
		        temp=temp.next;
		    }
		    else
		    {
		        return false;
		    }
		}
		
		return true;
		
	}
}
