/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
    
  public static Node deleteNode(Node head){
    if(head==null || head.next==null)
    {
        return null;
    }
    Node slow = head;
    Node fast = head;
    Node pre = null;
    
    while(fast!=null && fast.next!=null)
    {   pre = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    
    pre.next = slow.next;
    return head;
  }
}
