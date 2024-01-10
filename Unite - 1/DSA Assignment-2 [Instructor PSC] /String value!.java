public static void stringValue(String s){
    //write your code here
    
    int sum = 0;
    for(int i = 0; i < s.length(); i++)
    {
        int value = s.charAt(i)-96;
        
        sum = sum + value;
    }
    
    System.out.println(sum);
  }
