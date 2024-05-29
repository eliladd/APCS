public class Ship {
    private int x, y, length;
    private boolean rotate = false;
    public Ship(int x, int y, int length,boolean rotate){
        this.x = x;
        this.y = y;
        this.length = length;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getLength(){
        return length;
    }
    public boolean getRotate(){
        return rotate;
    }
}
