import java.util.Scanner;

public class Convertor {
    private double chislo;
    public void convertirovat(){
        int h=0;
        Scanner r1 = new Scanner(System.in);

        while(h==0) {
            System.out.println("Введите номер валюты :\n 1.Рубль \n2.Доллар \n3.Юань");

            System.out.println("->");
            h=r1.nextInt();

        }
        switch (h) {
            case 1:
                System.out.println("Введите деньги в рублях->");

                chislo=r1.nextDouble();
                System.out.println("В долларах:"+chislo/61.2);
                System.out.println("В юань:"+chislo/8.55);
                System.out.println("В евро:"+chislo/68.2);
                break;
            case 2:
                System.out.println("Введите деньги в долларах->");

                chislo=r1.nextDouble();
                System.out.println("В рублях:"+chislo*61.2);
                System.out.println("В юань:"+chislo*8.55);
                System.out.println("В евро:"+chislo/1.12);
                break;
            case 3:
                System.out.println("Введите деньги в евро->");

                chislo=r1.nextDouble();
                System.out.println("В долларах:"+chislo*1.12);
                System.out.println("В юань:"+chislo/8.55);
                System.out.println("В рублях:"+chislo*68.2);
                break;
        }
    }
}
