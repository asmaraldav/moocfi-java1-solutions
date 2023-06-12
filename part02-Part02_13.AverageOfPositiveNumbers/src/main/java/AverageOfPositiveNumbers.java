
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double posNum = 0;
        double sum = 0;
        
        while (true) {
            
            double number = Integer.valueOf(scanner.nextLine());
            
            
            if (number > 0) {
                posNum = posNum + 1;
                sum = sum + number;
            }
            
            if (number == 0){
                break;
            }
            
            if (number < 0) {
                continue;
            }
            
        }
        
        if (posNum == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        if (posNum > 0) {
            double avg = sum / posNum;
            System.out.println(avg);
        }

    }
}
