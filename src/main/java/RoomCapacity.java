import java.util.Scanner;
public class RoomCapacity {
    
    public static void main (String []args){
        
        int roomcap, participants; 
        Scanner uinput = new Scanner(System.in);
            System.out.println("Enter Room Capacity: ");
                roomcap = Integer.parseInt(uinput.next());
            System.out.println("Enter Number of Participants: ");
                participants = Integer.parseInt(uinput.next());
                
                if (participants>roomcap){
                    System.out.println("Remarks: Sorry! The meeting cannot be held due to Violation of Fire Regulation");
                    
                    int excess = participants-roomcap;
                        System.out.println("Excess Participants: " + excess);
                }
                else {
                    System.out.println("It is legal to hold a meeting");
                    
                    int excess = roomcap-participants;
                        System.out.println("Needed Participants in order to be full: " + excess);
                }         
}
}