
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2, 10 );

    }
    
    //method that prints out every number divisible my three within range
    public static void divisibleByThreeInRange(int beginning, int end) {
        
        int i = beginning;
        
        //while loop, stops when i is outside of the range
        while (i <= end) {
            
            if (i % 3 == 0) { //if i is divisible by 3
                
                System.out.println(i);
                
            }
            
            i++; //i is incremented by 1 with each loop
            
        }
        
    }

}
