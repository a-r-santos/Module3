import java.util.Scanner;
public class LetterGrades {
public static void main (String []args){
    
    Scanner uinput = new Scanner(System.in);
    System.out.println("Enter your Grade: ");
    int grade = uinput.nextInt();
    
        if (grade>=90 & grade<=100){
            System.out.println("Your Grade Equivalent to Letters is: A");
        }
        else if (grade>=80 & grade<=89){
            System.out.println("Your Grade Equivalent to Letters is: A-");
        }
        else if (grade>=70 & grade<=79){
            System.out.println("Your Grade Equivalent to Letters is: B");
        }
        else if (grade>=60 & grade<=69){
            System.out.println("Your Grade Equivalent to Letters is: B-");
        }
        else if (grade>=50 & grade<=59){
            System.out.println("Your Grade Equivalent to Letters is: C");
        }
        else if (grade>=0 & grade<=49){
            System.out.println("Your Grade Equivalent to Letters is: F");
        }
    
        else {
        System.out.println("Invalid Input");
        }
}
}
