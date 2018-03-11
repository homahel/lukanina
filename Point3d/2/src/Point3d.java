import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point3d
{
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d()
    {
        xCoord = 0.0;
        yCoord = 0.0;
        zCoord = 0.0;
    }
    public double getX()
    {
        return xCoord;
    }
    public double getY()
    {
        return yCoord;
    }
    public double getZ()
    {
        return zCoord;
    }
    public void setX(double p)
    {
        xCoord = p;
    }
    public void setY(double p)
    {
        yCoord = p;
    }
    public void setZ(double p)
    {
        zCoord = p;
    }
    public void equalpoints(Point3d p1, Point3d p2)
    {
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ())
            System.out.println("equal points");
        else
            System.out.println("not equal points");
    }
    public double distanceTo (Point3d p)
    {
        return (sqrt (pow (p.getX() - this.getX(), 2) + pow(p.getY() - this.getY(), 2) + pow(p.getZ() - this.getZ(), 2)) );
    }

}




