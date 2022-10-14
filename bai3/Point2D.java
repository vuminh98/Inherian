package bai3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private static float[] array;
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
       this.x = x;
       this.y = y;
    }

    public float[] getXY() {
        return array = new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D: " + "( " + x + "," + y + " ) " + Arrays.toString(getXY());
    }
}
