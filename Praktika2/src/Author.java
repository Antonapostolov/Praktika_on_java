public class Author {
    private String name;
    private String email;

    private char gender;
    Author(String name,String email,char gender1){
        this.name=name;
        this.email=email;
        if(gender1=='M'||gender1=='F'||gender1=='U') this.gender=gender1;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return this.name+"("+gender+") at "+email;
    }
}
