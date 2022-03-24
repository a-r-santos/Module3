import java.util.Scanner;
public class Vowel {
public static void main (String []args){
        
    Scanner uinput = new Scanner(System.in);
    System.out.println("Enter a Letter: ");
    char letter = uinput.next().charAt(0);
    
    
    switch (letter){
        case 'A', 'E', 'I', 'O', 'U' -> System.out.println("Letter " + letter + " is a vowel.");
        default -> System.out.println("Letter " + letter + " is a consonant.");       
    }
    }
}   
}
