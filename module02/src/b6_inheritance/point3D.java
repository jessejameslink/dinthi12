package b6_inheritance;

public class point3D  extends  point2D{
    private float z;

    public point3D (){
        super();
        this.z = 0;
    }
    public point3D (float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

  @Override
    public String toString(){
        return "(" + super.getX()+ ","+ super.getY() + "," + this.z +")";
  }
}
