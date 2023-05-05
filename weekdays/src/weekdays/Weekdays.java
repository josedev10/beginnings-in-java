
package weekdays;

import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String day;
        
        while(true){
            
        System.out.println("Enter a weekday: ");
            if(scanner.hasNextLine()){
                day=scanner.nextLine().toLowerCase();
                switch(day){
            case "monday":
                System.out.println("It is Monday");
                break;
            case "tuesday":
                System.out.println("It is Tuesday");
                break;
            case  "wednesday":
                System.out.println("It is Wednesday");
                break;
            case "thursday":
                System.out.println("It is Thursday");
                break;
            case "friday":
                System.out.println("It is Friday");
                break;
            case "saturday":
                System.out.println("It is Saturday");
                break;
            case "sunday":
                System.out.println("It is Sunday");
                break;
             default:
                System.out.println("Have a error");
                break; 
        }
            }else{
                System.out.println("Enter a valited data");
            }
        }
        
        
    }
    
}
