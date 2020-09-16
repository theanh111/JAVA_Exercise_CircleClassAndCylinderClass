public class Cylinder extends Circle {
    private double height = 3.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getRadius() * getRadius() * height * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + super.getRadius()
                + ", color = "
                + super.getColor()
                + ", height = "
                + getHeight()
                + ", volume = "
                + getVolume();
    }
}
