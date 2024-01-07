public static void solve(String str){
    
     LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();
     
     int n = str.length();
     
     for(int i=0; i<n; i++)
     {
         char ch = str.charAt(i);
         
         if(map.containsKey(ch))
         {
             int fre = map.get(ch);
             map.put(ch,fre+1);
         }
         else
         {
             map.put(ch,1);
         }
     }
     
     for(Map.Entry<Character,Integer> i : map.entrySet())
     {
         System.out.print(i.getKey());
     }
  }
