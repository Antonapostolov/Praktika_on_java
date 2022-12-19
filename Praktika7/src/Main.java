public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        MovablePoint t=new MovablePoint(13,14,12,13);
        MovablePoint y=new MovablePoint(1,2,1,13);
        y.SpeedTest(t);
        System.out.println("Задание 4");
        MathCalculable fu1=new MathFunc();
        ((MathFunc) fu1).Dlina_okr(3);
        System.out.println("Задание 5");
        String d=new String();
        d="djdhhhd";
        System.out.println(RABOTA_SO_STROKAMI.Kol_vo(d));
        System.out.println(RABOTA_SO_STROKAMI.Vozvrat(d));
        d="djdhhhd";
        System.out.println(RABOTA_SO_STROKAMI.Revers(d));
    }


}