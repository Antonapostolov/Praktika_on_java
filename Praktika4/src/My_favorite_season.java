public enum My_favorite_season {
    Leto(24),Zima(-30),Vesna(-11),Osen(-15);
    double sr_temperature;

    My_favorite_season() {

    }

    String Description;
    public String getDescription(){
        if(My_favorite_season.this==Leto) {
            Description ="Теплое время года";
        }
        else{
            Description="Холодное время года";
        }
        return Description;
    }
    void proverka( ){

        switch (My_favorite_season.this){
            case Leto:
                System.out.println("Я люблю "+Leto);
                break;
            case Zima:
                System.out.println("Я люблю "+Zima);
                break;
            case Vesna:
                System.out.println("Я люблю "+Vesna);
                break;
            case Osen:
                System.out.println("Я люблю "+Osen);
                break;
        }
    }
    My_favorite_season( double sr_temperature){
        this.sr_temperature=sr_temperature;
    }

}
