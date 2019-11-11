package Pract1;


/**
 * class FiguresGroupUse.
 * 
 * @author LTP 
 * @version 2018-19
 */
public class FiguresGroupUse {
    public static void main(String[] args) {
        FiguresGroup g = new FiguresGroup();
        g.add(new Circle(10, 5, 3.5));
        g.add(new Rectangle(10, 5, 6.5, 32));
       
        System.out.println(g);
        System.out.println("El área total del grupo es: " + g.area());
        System.out.println("La figura con más área es: \n " + g.greatestFigure());
    }
}