import java.util.*;
 
 public class Main {
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         Queue <Integer> c1 = new LinkedList<>();
         Queue <Integer> c2 = new LinkedList<>();
         Queue <Integer> c3 = new LinkedList<>();
         Queue <Integer> c4 = new LinkedList<>();
         Queue <Integer> Master = new LinkedList<>();
         
         
         for(int i=0; i<n; i++)
         {
             char ch = sc.next().charAt(0);
             
             if(ch=='E')
             {
                 int club = sc.nextInt();
                 
                 int roll = sc.nextInt();
                 
                 if(Master.isEmpty() || !Master.contains(club))
                 {
                     Master.add(club);
                 }
                 if(club==1)
                 {
                     c1.add(roll);
                 }
                 else if(club==2)
                 {
                     c2.add(roll);
                 }
                 else if(club==3)
                 {
                     c3.add(roll);
                 }
                 else 
                 {
                     c4.add(roll);
                 }
             }
             
             else
             {
                 if(Master.peek()==1)
                 {
                     System.out.println(1+" "+c1.remove());
                 
                 if(c1.isEmpty())
                 {
                     Master.remove();
                 }
                 }
                 else if(Master.peek()==2)
                 {
                     System.out.println(2+" "+c2.remove());
                 
                 if(c2.isEmpty())
                 {
                     Master.remove();
                 }
                 }
                 else if(Master.peek()==3)
                 {
                     System.out.println(3+" "+c3.remove());
                 
                 if(c3.isEmpty())
                 {
                     Master.remove();
                 }
                 }
                 else if(Master.peek()==4)
                 {
                     System.out.println(4+" "+c4.remove());
                 
                 if(c4.isEmpty())
                 {
                     Master.remove();
                 }
                 }
             }
         }
         
     }
 }
