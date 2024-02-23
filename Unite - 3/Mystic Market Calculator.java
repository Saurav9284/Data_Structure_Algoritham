import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        sc.nextLine(); 
        
        for (int a = 0; a < t; a++) {
            
            int items = sc.nextInt();
            
            sc.nextLine(); 
            
            int totalCost = 0;
            
            for (int i = 0; i < items; i++) {
                
                String line = sc.nextLine();
                
                String[] parts = line.split("[^a-zA-Z0-9]+");
                
                String itemName = parts[0];
                
                int pricePerUnit = Integer.parseInt(parts[1]);
                int numberOfUnits = Integer.parseInt(parts[2]);
                
                int itemCost = pricePerUnit * numberOfUnits;
                totalCost += itemCost;
                System.out.println(itemName + " " + itemCost);
            }
            System.out.println("Total " + totalCost);
        }
        
    }
}
