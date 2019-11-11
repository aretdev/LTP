package Pract2;

public class Square extends Rectangle{
    public Square(double x, double y, double lado) {
           super(x, y, lado, lado);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Square)) return false;
        return super.equals(o);
    }
}
