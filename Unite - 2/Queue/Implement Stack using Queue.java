class Solution{
  Queue<Integer> queue1 = new LinkedList<>();
  Queue<Integer> queue2 = new LinkedList<>();
  
  public void push(int data){
    while(!queue1.isEmpty())
    {
        queue2.add(queue1.remove());
    }
    queue1.add(data);
    while(!queue2.isEmpty())
    {
        queue1.add(queue2.remove());
    }
  }
  
  public void pop(){
    queue1.remove();
  }
  
  public int top(){
    return queue1.peek();
  }
}
