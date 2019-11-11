package Pract2;

import java.util.*;

/**
 * class FiguresGroupUse.
 * 
 * @author LTP 
 * @version 2018-19
 */
public class FiguresGroupUse {
    public static void main(String[] args) {
    FiguresGroup g = new FiguresGroup();
    g.add(new Circle(1.0, 6.0, 6.0));
    g.add(new Rectangle(2.0, 5.0, 10.0, 12.0));
    g.add(new Triangle(3.0, 4.0, 10.0, 2.0));
    g.add(new Circle(4.0, 3.0, 1.0));
    g.add(new Triangle(5.0, 1.0, 1.0, 2.0));
    g.add(new Square(6.0, 7.0, 15));
    g.add(new Rectangle(7.0, 2.0, 1.0, 3.0));
    System.out.println(g.orderedList());
    System.out.println(g.toString());
    g.print('x');
   /*
   List l = new LinkedList(); // O new ArrayList();
   Random r = new Random();
   for (int i = 0; i < 100; i++) {
       if (r.nextInt(2) == 0) {
        double b = r.nextDouble() * 10;
        double h = r.nextDouble() * 10;
        l.add(new Rectangle(1, 1, b, h));
    } else {
        double b = r.nextDouble() * 10;
        l.add(new Square(1, 1, b));}
    }
    for (int i = 0; i < 100; i++) {
    Rectangle fi = (Rectangle) l.get(i);
    for (int j = i + 1; j < 100; j++) {
        Rectangle fj = (Rectangle) l.get(j);
        if (fi.compareToRange(fj) == 0) {
            System.out.print("Figuras iguales: "
                + fi.getClass().getName() + " " + i
                + " y " + fj.getClass().getName() + " " + j
                + "\n Areas: " + fi.area()
                + ", " + fj.area() + "\n");
            } 
        }
    }
    */
    
    }
}
