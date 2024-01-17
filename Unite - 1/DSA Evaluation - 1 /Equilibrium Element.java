public static void solve(int N, int A[]){
    
      int totalSum =0;
      int leftSum = 0;
      int ans = -1;
      
      // Calculate the total sum of all elements
        for (int i=0; i<N; i++)
        {
            totalSum += A[i];
        }

        // Iterate through the array to find the equilibrium point
        for (int i=0; i<N; i++)
        {
            // Subtract the current element from the total sum to get the right sum
            totalSum -= A[i];

            // If the left sum is equal to the right sum, we have found the equilibrium point
            if (leftSum == totalSum) 
            {
                ans = i;
            }

            // Update the left sum by adding the current element
            leftSum += A[i];
        }
        
        System.out.println(ans);

    }
