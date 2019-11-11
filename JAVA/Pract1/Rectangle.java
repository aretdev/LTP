package Pract1;

public class Rectangle extends Figure {
    private double base;
    private double height;
    public Rectangle(double x , double y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }
    
    public String toString() {
        return "Rectangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    public double area(){
        return this.base * this.height;
    }
    public double perimeter() {
        return 2 * (base + height);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Rectangle)) return false;
        return super.equals(o);
    }
}
