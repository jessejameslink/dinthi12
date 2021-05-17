package b6_inheritance;

public class cylinder extends Circle{
    public float height;

    protected float volume(float radius,float height){
        return height*PI*radius*radius;
    }

}
