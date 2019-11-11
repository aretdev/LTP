package Pract2;

import java.util.*;

/**
 * class FiguresGroup.
 * 
 * @author LTP 
 * @version 2018-19
 */

public class FiguresGroup implements Printable{
    private static final int NUM_FIGURES = 10;
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;
    
    public void add(Figure f) { figuresList[numF++] = f; }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < numF; i++) {
            s += "\n" + figuresList[i] + "\n area: " + figuresList[i].area() + "\n";
        }
        return s;
    }

    private boolean found(Figure f) {
        for (int i = 0; i < numF; i++) {
            if (figuresList[i].equals(f)) return true;
        }
        return false;
    }

    private boolean included(FiguresGroup g) {
        for (int i = 0; i < g.numF; i++) {
            if (!found(g.figuresList[i])) return false;
        }
        return true;
    }
    
    public double area(){
        double suma = 0;
        for(int i = 0; i < numF; i++) {
            suma += figuresList[i].area();
        }
        return suma;
    }
    
    public Figure greatestFigure() {
        if(numF != 0) {
            Figure res = figuresList[0];
            for(int i = 1; i < numF; i++){
                if(figuresList[i].area() > res.area()){
                    res = figuresList[i];
                }
            }
            return res;
        }
        return null;
    }
    public boolean equals(Object o) {
        FiguresGroup obj = (FiguresGroup) o;
        return included(obj) && obj.included(this);
    }
    
    public List orderedList(){
        List res = new ArrayList<Figure>();
        if(figuresList[0] == null) return null;
        res.add(figuresList[0]);
        for(int i = 1; i < numF; i++) {
            int j = res.size() - 1;
            
            while(j > 0 && figuresList[i].compareTo(res.get(j)) < 0){
                j--;
            }
            res.add(j + 1, figuresList[i]);
        }
        return res;
    } 
    public void print(char c) {
        for (int i = 0; i < numF; i++) {
            figuresList[i].print(c);
        }
    }
}