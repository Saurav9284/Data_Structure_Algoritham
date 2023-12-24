public static void pattern(int N){
      
      int number=1;
    for(int i=1; i<=N; i++){
        
        for(int j=1; j<=N; j++)
        {
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
  }
