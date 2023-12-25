public static void oddsumbelow(int num){
        int sum=0;
        for(int i=1; i<=num; i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
