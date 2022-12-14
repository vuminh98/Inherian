package bai4;

public class MovablePoint extends Point {
    private static float[] array;
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return array = new float[]{x, y};
    }

    @Override
    public String toString() {
        return "( " + x + ", " + y + " )" + " speed = " + "(" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
