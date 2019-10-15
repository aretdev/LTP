package Pract2;

public class Rectangle extends Figure implements ComparableRange, Printable {
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
    public int compareToRange(Object o){
        if(!(o instanceof Rectangle)) return -1;
        
        Rectangle r2 = (Rectangle) o;
        double difference = Math.abs(this.area() - r2.area());
        
        if(difference <= ((this.area() + r2.area()) * 0.10)) return 0;
        if(this.area() < r2.area()){
            return -1;}
        return 1;
    }
    public double perimeter() {
        return 2 * (base + height);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Rectangle)) return false;
        return super.equals(o);
    }
    public void print(char c) { 
        int b = (int) base;
        int h = (int) height;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c +  " ");
        }
            System.out.println();
        }
    }
}
