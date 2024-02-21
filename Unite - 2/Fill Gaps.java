
class Solution {

	public ListNode fillGaps(ListNode head) {
		
		 if (head == null)
		 {
            return null;
         }

        ListNode current = head;

        while (current.next != null)
        {
            int diff = current.next.val - current.val;

            if (diff > 1)
            {
                int new_node_val = current.val + 1;
                ListNode new_node = new ListNode(new_node_val);

                new_node.next = current.next;
                current.next = new_node;
            }

            current = current.next;
        }

        return head;
	}
}
