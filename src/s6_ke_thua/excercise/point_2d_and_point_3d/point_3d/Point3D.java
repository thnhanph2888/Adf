package excercise.point_2d_and_point_3d.point_3d;

import excercise.point_2d_and_point_3d.point_2d.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D (){
    }

    public Point3D (float z){
        this.z = z;
    }

    public Point3D (float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z, float x, float y){
        this.z = z;
        super.setXY(x, y);
    }

    public float[] getXYZ(){
        return new float[]{this.getZ(), getX(), getY()};
    }

    @Override
    public String toString() {
        return  "\"(" + getX()
                + ", " + getY()
                + ", " + getZ() + ")\"";
    }
}
