public class Main {
    public static void main(String[] args) {

        for(My_favorite_season Pu:My_favorite_season.values()){
            System.out.println(Pu);
        }
        My_favorite_season hw=My_favorite_season.Leto;
        hw.proverka();
        hw=My_favorite_season.Zima;
        hw.proverka();
        hw=My_favorite_season.Osen;
        hw.proverka();
        hw=My_favorite_season.Vesna;
        hw.proverka();

        System.out.println( hw.getDescription());
        hw=My_favorite_season.Leto;
        System.out.println( hw.getDescription());
        for(My_favorite_season Ru:My_favorite_season.values()){
            System.out.println(Ru+" "+Ru.Description+" Средняя температура: "+Ru.sr_temperature);
        }
    }
}
