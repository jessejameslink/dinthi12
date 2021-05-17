package b6_inheritance;

public class point2D {
    public float x;
    public float y;

    public point2D() {
        this.x = 0f;
        this.y = 0f;
    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +getX()+","+getY()+
                ')';
    }
}
