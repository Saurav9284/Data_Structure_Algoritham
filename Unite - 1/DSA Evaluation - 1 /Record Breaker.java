public static void solve(int N, int A[]){
    
        int maxScore = A[0];
        int minScore = A[0];
        int breakMaxRecord = 0;
        int breakMinRecord = 0;

        for (int i=1; i<N; i++)
        {
            if (A[i]>maxScore)
            {
                maxScore = A[i];
                breakMaxRecord++;
            } 
            else if (A[i]<minScore)
            {
                minScore = A[i];
                breakMinRecord++;
            }
        }

        System.out.println(breakMaxRecord+" "+ breakMinRecord);

    }
