package ss6_inheritance.bai_tap.point2d;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
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
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3d{" + super.getX() +
                " " + super.getY()
                + " " +
                "z=" + z + " " +
                '}';
    }
}
