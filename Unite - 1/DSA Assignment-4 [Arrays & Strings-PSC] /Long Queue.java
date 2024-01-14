public static void minimumNumberOfGroups(int N, int A[]){
    
    int groups = 1;

        for (int i = 1; i < N; i++)
        {
            if (A[i] < A[i - 1])
            {
                groups++;
            }
        }

        System.out.println(groups);
  }
