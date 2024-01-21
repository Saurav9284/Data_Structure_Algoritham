  public static void solve(int n, String str){
 
        String ans = function(str);
        
        System.out.println(ans);
    }

    public static String function(String str) {
        
        StringBuilder sb = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i - 1))
            {
                count++;
            }
            else
            {
                sb.append(str.charAt(i - 1));
                
                sb.append(count);
                
                count = 1;
            }
        }

     
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        
        return sb.toString();
    }
