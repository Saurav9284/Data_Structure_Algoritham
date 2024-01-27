import java.util.*;
   public class Main {
       
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[][] matrix = new char [3][3];
            
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    matrix[i][j] = sc.next().charAt(0);
                }
            }
    
        char winner = find(matrix);

        if (winner == 'x')
        {
            System.out.println("x");
        } 
        else if (winner == 'o') 
        {
            System.out.println("o");
        }
        else
        {
            System.out.println("Tie");
        }
    }

    public static char find(char[][] matrix) {
    
        for (int i = 0; i < 3; i++) {
        
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2] && matrix[i][0] != ' ') {
                return matrix[i][0];
            }
         
            if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i] && matrix[0][i] != ' ') {
                return matrix[0][i];
            }
        }

   
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[0][0] != ' ') {
            return matrix[0][0];
        }
        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[0][2] != ' ') {
            return matrix[0][2];
        }

        return ' ';
    }
}
