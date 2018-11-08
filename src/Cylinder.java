public class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "This cylinder has radius: "+getRadius()+", color: "+getColor()+" and height: "+getHeight();
    }
}