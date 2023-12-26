public static void solve(int N,int X, int Y, int price[]){
    
    int total = 0;
    
    for(int i=0; i<N; i++)
    {
        total += price[i];
    }

    int discount = 0;
    
    for(int i=0; i<N; i++)
    {
        if(price[i]>Y)
        {
            discount += price[i]-Y;
        }
        else
        {
            price[i] = 0;
        }
    }
    
    int finaldiscount = discount + X;
    
    if(finaldiscount<total)
    {
       System.out.println("YES");
    }
    else 
    {
        System.out.println("NO");
    }
    
    
  }
