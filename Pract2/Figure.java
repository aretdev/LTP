package Pract2;


/**
 * class Figure.
 * 
 * @author LTP 
 * @version 2018-19
 */

public abstract class Figure implements Comparable, Printable {
    protected double x,y;
    
    public Figure(double x, double y) {
        this.x = x; 
        this.y = y; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Figure)) { return false; }
        Figure f = (Figure) o;
        return x == f.x && y == f.y;
    }
    public abstract double area();
    public abstract double perimeter();
    public String toString() {
        return "Position: (" + x + ", " + y + ")"; 
    }
    public int compareTo(Object o) {
        if(o instanceof Figure){
            Figure l2 = (Figure) o;
            if(this.area() == l2.area()){
                return 0;
            } else if(this.area() < l2.area()) {
                return -1;
            }else{
                return 1;
            }
        }
        return -99;
    }
    public void print(char  c){}
}