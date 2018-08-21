package triangle;

public class MyPoint {
    private int x;
    private int y;

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+ Math.pow(this.y -y,2 ));
    }
    public double distance(MyPoint anoherPoints){

        return Math.sqrt(Math.pow(anoherPoints.getX() - this.getX(),2)
                + Math.pow(anoherPoints.getY() - this.getY(),2));
    }

    public MyPoint(int x,int y){
        this.x= x;
        this.y = y;


    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +"x="+ x + ", y= " + y + "}";
    }
}
