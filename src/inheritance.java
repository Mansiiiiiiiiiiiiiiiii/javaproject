public class inheritance {
    public int gear;
    public int speed;
    //constructor
    public inheritance(int gear, int speed){
        this.gear = gear;
        this.speed=speed;

    }
    //method
    public void applyBreak(int dec){
        speed -= dec;
    }
    public void speedUp(int inc){
        speed += inc;
    }

}
