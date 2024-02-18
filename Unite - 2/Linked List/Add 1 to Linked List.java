/*
class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/
class Solution{
    
  public Node addOneToLinkedList(Node head){
    
        head = Rev(head);  
        Node temp = head;
        
        while(temp!=null)
        {
            if(temp.data!=9)
            {
                temp.data++;
                break;
            }
            
            else
            {
                temp.data=0;
                if(temp.next==null)
                {
                    temp.data=0;
                    Node n = new Node(1);
                    temp.next=n;
                    break;
                }
                else
                {
                    temp=temp.next;
                }
            }
        }
            head = Rev(head);
            return head;
    }
    public static Node Rev(Node head){
    
             Node pre = null;
             Node curr = head;
             Node next = null;
    
        while(curr!=null)
          {
              next = curr.next;
              curr.next = pre;
              pre = curr;
              curr = next;
           }
    
            return pre;
          }
}
