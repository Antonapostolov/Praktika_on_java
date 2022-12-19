public class Animal implements Comparable<Animal>{
    private int years;
    private String type;
    public Animal(int y,String str){
        years=y;
        type=str;
    }
    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.years, o.years);
    }

    @Override
    public String toString() {
        return ""+type;
    }
}

