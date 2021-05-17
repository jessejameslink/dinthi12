package b6_inheritance;

public class movablePoint  extends point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public movablePoint(){
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public movablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[]arr=new float[2];
        arr[0]=xSpeed;
        arr[1]=ySpeed;
        return arr;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+" ,speed=( "+xSpeed+" ,"+ySpeed+" )";
    }

    public movablePoint move(){
        this.setX(xSpeed+this.getX());
        this.setY(ySpeed+this.getY());

        return this;
    }
}
