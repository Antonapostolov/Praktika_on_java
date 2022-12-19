public interface RABOTA_SO_STROKAMI {
    public static int Kol_vo(String s){
        return s.length();
    }
    public static StringBuilder Vozvrat(String s){
        StringBuilder f=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2!=0) {
                f.append(s.charAt(i));

            }
        }
        return f;
    }
    public static StringBuilder Revers(String s){

        return new StringBuilder(s).reverse();
    }
}
