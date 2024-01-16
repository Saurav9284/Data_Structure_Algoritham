public static void masaiPalindromicSubstring(String str){
     int max = 0;

        for (int ce= 0; ce< str.length(); ce++) 
        {
            int odd = function(str, ce, ce);
            
            int even = function(str, ce, ce + 1);
            
            max = Math.max(max, Math.max(odd, even));
        }

        System.out.println(max);
    }

    public static int function(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
