public class TernaryOperator {

    public static void main(String[] args) {
     


        int x = 6, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }

        
         // Use a ternary operator to perform the same logic as above.
        System.out.println("After if stmt, x = " +(y/x<3 ? x+y : x*y));
    }
}

      
    

