public class ThrowsDemo {
    public void printMessage(String key) {
        try{
            System.out.println( key );
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
