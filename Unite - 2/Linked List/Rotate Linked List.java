/*
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/

class Solution{
  
  public static Node rotateNode(Node a,int k,int n){
    
    if(a==null || a.next==null || k==0)
    {
        return a;
    }
    
    int step = k%n;
    if(step==0)
    {
        return a;
    }
    
    Node curr = a;
    for(int i=1; i<n-step; i++)
    {
        curr = curr.next;
    }
    
    Node newHead = curr.next;
    curr.next = null;
    
    Node tail = newHead;
    while(tail.next!=null)
    {
        tail=tail.next;
    }
    
    tail.next=a;
    return newHead;
  }
}
