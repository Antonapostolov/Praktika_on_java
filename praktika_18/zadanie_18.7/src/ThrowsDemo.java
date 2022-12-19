import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) {
        if(key == "") {
            throw new Exception("eee");
        }
        return "data for " + key; }
}
