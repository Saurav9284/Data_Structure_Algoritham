public static void patternOfN(int num){
    
    int number =1;
    
    for(int i=1; i<=num; i++)
    {
        for(int j=1; j<=num; j++)
        {
            System.out.print(number+" ");
            number++;
        }
        
        System.out.println();    
        
    }
  }
