package ThucHanh.LopHinhChuNhat;

public class Rectangle {
    //Fields
    double width, height;

    //Constructors
    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Methods

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public String display() {
        return "Rectangle { width: " + width + ", height: " + height + " }";
    }
}
