import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            try {
                System.out.println( 2/i );
            }catch (ArithmeticException e){
                System.out.println(e);
            }
        }catch (NumberFormatException e1){
            System.out.println(e1);
        }
        finally {
            System.out.println("Finally");
        }

    }
}
