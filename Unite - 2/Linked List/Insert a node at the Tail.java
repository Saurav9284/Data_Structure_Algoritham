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

  public static Node insertAtTail(Node a, int val){
      
    if(a==null)
    {
      Node ne = new Node(val,null);
      return ne;
    }
    else
    {
      Node temp = a;
    
    while(temp.next!=null)
    { 
        temp = temp.next;
    }
    
    Node n = new Node(val,null);
    
    temp.next = n;
    
    return a;
    }
    
  }
}
