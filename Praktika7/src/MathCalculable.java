public interface MathCalculable {
    public static double PI=Math.PI;
    public static double Stepen(double h, double s){
        return Math.pow(h,s);
    }
    public  static double Module(double real,double im){
        return Math.sqrt(Math.pow(real,2)+Math.pow(im,2));
    }
}
