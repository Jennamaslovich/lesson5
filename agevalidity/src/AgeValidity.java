import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean drivingUnderAge=false;
        System.out.println("Type your age:");
        double age=sc.nextInt();

        if (age<18){
            drivingUnderAge=true; // my age is 17, output should be "Driving Underage: true"

        }
        System.out.println("Driving Underage: "+drivingUnderAge+"");
       
    }
}
