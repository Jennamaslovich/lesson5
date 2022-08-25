import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {
String status="";
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();

        if (num==1){
            status="Odd Number";
        }
        if (num==2){
            status="Even Number";
        }

        if (num==3){
            status="Odd Number";
        }

        if (num==4){
            status="Even Number";
        }
        if (num==5){
            status="Odd Number";
        }
        if (num==6){
            status="Even Number";
        }

        if (num==7){
            status="Odd Number";
        }

        if (num==8){
            status="Even Number";
        }

        if (num==9){
            status="Odd Number";

        }


        if (num==10){
            status="Even Number";
        }
        System.out.println(status);
    }
}
