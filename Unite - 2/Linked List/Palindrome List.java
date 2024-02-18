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
  public static boolean detectPalindrome(Node a){
    
    Node pre =null;
    Node curr = a;
    Node next  = null;
    
    while(curr!=null)
    {
        next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }
    
    while(pre!=null && a!=null)
    {
        if(a.data!=pre.data)
        {
            return false;
        }
        else
        {
            a = a.next;
            pre = pre.next;
        }
    }
    return true;
  }
}
