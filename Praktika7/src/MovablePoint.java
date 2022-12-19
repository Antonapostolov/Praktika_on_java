public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }


    public String toString() {
        return "x="+x+"; y="+y+"; Скорость x:"+xSpeed+"; Скорость y:"+ySpeed;
    }
    public void SpeedTest( MovablePoint f){
        if((f.ySpeed==this.ySpeed)&&(f.xSpeed==this.xSpeed)){
            System.out.println("Скорость  одинакова");
        }
        else{
            System.out.println("Скорость  разная");
        }
    }
    @Override
    public void moveUp() {

        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}