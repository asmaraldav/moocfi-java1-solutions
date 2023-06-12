
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int count = 0; count <= n; count++) {
            
            sum += count; 
            
        }
        
        System.out.println("The sum is " + sum);


    }
}
