import java.util.*;
    
    
    class Main{
        
    public static class Pair{
        
        int key;
        int index;
        
        public Pair(int key, int index){
            this.key=key;
            this.index=index;
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
            int n= sc.nextInt();
            int m= sc.nextInt();
            
        Queue<Pair> queue= new LinkedList<>();
        
        Queue<Pair> te= new LinkedList<>();
        
        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            
            queue.add(new Pair(a,i));
        }
   
    ArrayList<Integer> list= new ArrayList<>();
    
      int num=m;
      int index=0;
      
      while(num-->0){
          int max=Integer.MIN_VALUE;
          int iter=Math.min(m,queue.size());
        
          for(int i = 0; i < iter; i++)
          {
            if(max < queue.peek().key)
            {       
                max = queue.peek().key;
                index = queue.peek().index;
            }
            
            te.add(queue.peek());
            queue.remove();
        }
      
        list.add(index+1);
        
       int flag = 0;
        while(!te.isEmpty()) 
        {
            if(te.peek().key == max && flag == 0)
            {
                te.remove();
                flag++;                          
            }
            else if(te.peek().key > 0)
            {
                te.peek().key -= 1;         
                queue.add(te.peek());
                te.remove();
            }
            else                           
            {
                queue.add(te.peek());
                te.remove();
            }
        }
    }
   
    for(int i=0; i<list.size();i++)
    {
         System.out.print(list.get(i)+" ");
    }
    
  }
}
