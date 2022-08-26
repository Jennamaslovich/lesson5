import java.util.Scanner;


public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;


        if (age>=11 && age<65){
            fare=5; // 11-65
        }
        else{
            fare=3; // 0-11 and 65-beyond
        }
        System.out.println("Fare: $"+fare);
        keyboard.close();
    }
}
