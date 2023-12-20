public static void masaiDivisors(int left,int right,int k){
      int count=0;
      for(int i=left; i<=right; i++)
      {
          if(i%k==0)
          {
              count=count+1;
          }
      }
            System.out.println(count);
  }
