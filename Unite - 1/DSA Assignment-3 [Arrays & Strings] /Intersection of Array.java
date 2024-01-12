public static void intersectionOfArray(int n,int[] arr1,int[] arr2){
    //write your code here
    
    for(int i = 0; i < n; i++)
    {
            int a = arr1[i];
        
        for(int j=0; j<n; j++)
        {
            int b = arr2[j];
        
        
        if(a==b)
        {
            System.out.println(arr1[i]);
        }
        }
    }
  }
