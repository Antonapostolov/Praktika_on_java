public class Ball {
    private String Material;
    private boolean Nakachan;
    public Ball(String Material1, boolean Nakachan1){
        Material = Material1;
        Nakachan = Nakachan1;

    }
    public Ball(String Material1){
        Material = Material1;
        Nakachan = false;
    }
    public Ball(){
        Material = "Не дано";
        Nakachan = false;
    }
    public void setNakachan(boolean Nakachan) {
        this.Nakachan = Nakachan;
    }
    public void setMaterial(String material) {
        this.Material = material;
    }
    public String getName(String name){
        return name;
    }
    public boolean getNakachan() {
        return Nakachan;
    }
    public String toString(){
        String h;
        if(Nakachan==true)
            h="Мяч накачан!";
        else h="Мяч не накачан!";
        return "Материал:"+Material+" Состояние мяча:" +h+"\n";
    }

}
