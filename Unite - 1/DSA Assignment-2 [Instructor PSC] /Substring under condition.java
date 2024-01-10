public static void subStrUnderCond(String s){
    
      int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
