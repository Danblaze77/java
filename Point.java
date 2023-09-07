class Point {
     float x;
     float y;

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0.0f, 0.0f);
    }
    float getX()
    {
        return x;
    }
       float getY()
    {
        return y;
    }
}

class MovablePoint extends Point {
     float xSpeed;
     float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed);
    }

    public MovablePoint() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Initial position: (" + point.x + "," + point.y + ")");

        point.move();
        System.out.println("After moving: (" + point.x + "," + point.y + ")");
        Point obj = new Point();
        obj.getX();
        obj.getY();
    }
}
