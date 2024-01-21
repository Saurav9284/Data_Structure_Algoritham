public static void solve(int n, int arr[]){
    
        int left = 0;
        int right = n-1;
        int akhil = 0;
        int ankush = 0;
        int max = 0;

        while (left <= right) 
        {
            if(akhil<=ankush) 
            {
                akhil += arr[left];
                left++;
            } 
            else 
            {
                ankush += arr[right];
                right--;
            }

            if(akhil==ankush) 
            {
                max = Math.max(max,left+(n-right-1));
            }
        }

        System.out.println(max);
  }
