import java.util.*;
  import java.io.*;

 class SpecialStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public SpecialStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) 
    {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() 
    {
        if (stack.isEmpty()) {
            System.out.println("EMPTY");
            return;
        }

        if (stack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        
        stack.pop();
    }

    public void getMin() {
        
        if (minStack.isEmpty()) 
        {
            System.out.println("EMPTY");
            return;
        }
        
        System.out.println(minStack.peek());
    }
}

  public class Main {
      
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }  
      
    public static void main(String[] args) {
        
        FastReader scanner = new FastReader();
        
        int N = scanner.nextInt();

        SpecialStack stack = new SpecialStack();

        for (int i = 0; i < N; i++) 
        {
            String operation = scanner.next();
            
            switch (operation) 
            {
                case "PUSH":
                    
                    int value = scanner.nextInt();
                    
                    stack.push(value);
                    
                    break;
                    
                case "POP":
                    
                    stack.pop();
                    
                    break;
                    
                case "MIN":
                    
                    stack.getMin();
                    
                    break;
            }
        }
    }
}
