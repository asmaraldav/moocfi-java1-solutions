
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double inputs = 0;
        double sum = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0){
                break;
            }
            
            inputs = inputs + 1;
            sum = sum + number;
            
        }
        
        double average = sum / inputs;
        System.out.println("Average of the numbers: " + average);

    }
}
