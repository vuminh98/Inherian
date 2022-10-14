package bai3;

import java.util.Arrays;

public class Point3D extends Point2D{
    public float z = 0.0f;
    private float[] array1;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  float[] getXYZ() {
        return array1 = new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}' + Arrays.toString(getXYZ());
    }
}
