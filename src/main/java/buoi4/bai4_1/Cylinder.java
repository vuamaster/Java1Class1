package buoi4.bai4_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<= 0 ){
            throw new RuntimeException("chieu cao lon hon 0");
        }
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        if(height<= 0 ){
            throw new RuntimeException("chieu cao lon hon 0");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<= 0 ){
            throw new RuntimeException("chieu cao lon hon 0");
        }
        this.height = height;
    }
    public  double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() +
                "height=" + height ;
    }
}
