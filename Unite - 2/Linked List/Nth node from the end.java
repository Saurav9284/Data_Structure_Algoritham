/*
class Node{
  int data;
  Node next;
  
  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
    
  public int nthNode(Node head,int n){
      
      Node traverse = head;
      int count = 0;
      
      while(traverse!=null)
      {
          traverse=traverse.next;
          count++;
      }
      int i=0;
      Node temp = head;
      while(i!=count-n)
      {
          temp = temp.next;
          i++;
      }
      return temp.data;
  }
}
