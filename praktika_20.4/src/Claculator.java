public class Claculator {
    static public <T extends Number> void  sum(T g, T e){

        System.out.println(g.doubleValue()+e.doubleValue());

    }
    static public <T extends Number> void  divide(T g, T e){

        System.out.println(g.doubleValue()/e.doubleValue());

    }
    static public <T extends Number> void  mult(T g, T e){

        System.out.println(g.doubleValue()*e.doubleValue());

    }
    static public <T extends Number> void  substraction(T g, T e){

        System.out.println(g.doubleValue()-e.doubleValue());

    }


    public static void main(String[] args) {
        int y=7;
            Claculator.sum(2.3f,y);
        Claculator.divide(2.3,y);
        Claculator.mult(2.3,y);
        Claculator.substraction(2.3,y);
        }


}
