package Pract1;


public abstract class Triangle extends Figure {
    private double base; 
    private double height;

    public Triangle(double x, double y, double b, double h) {
        super(x, y);
        base = b;
        height = h;
    }

    public String toString() {
        return "Triangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    public double area(){
        return this.base * this.height / 2;
    }
    public abstract double perimeter();
    public boolean equals(Object o) {
        if(!(o instanceof Triangle)) return false;
        return super.equals(o);
    }
}