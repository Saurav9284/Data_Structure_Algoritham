 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         for(int a=0; a<t; a++)
         {
             int l = sc.nextInt();
             
             int r = sc.nextInt();
             
             for(int i=l; i<=r; i++)
             {
                 int num = i;
                 
                 if(isunique(num))
                 {
                     System.out.println(num);
                     break;
                 }
             }
         }
     }
     
     public static boolean isunique(int n){
         
         HashMap<Integer,Integer> map = new HashMap<>();
         
         while(n>0) {
         
         int rem = n%10;
         n = n/10;
         
         if(map.containsKey(rem))
         {
             return false;
         }
         else
         {
             map.put(rem,1);
         }
         
         }
         
         return true;
     }
 }
