package excercise.point_2d_and_point_3d.point_3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2.3f);
        System.out.println(point3D);
        point3D = new Point3D(2.3f, 2.4f, 6.4f);
        System.out.println(point3D);
    }
}
