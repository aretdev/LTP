package Pract3;

import java.util.*;
import java.io.*;

/**
 * class ArrayListUse.
 * 
 * @author LTP
 * @version 2018-19
 */

public class ArrayListUse {       
    public static void main(String[] args) {        
        if (args.length != 1) {
            System.err.print("You must specify an argument: filename");
            System.exit(0);
        }
        
        // Creating File object, Scanner object, ArrayList object
        File f = new File(args[0]);
        Scanner sc = null;
        ArrayList<String> l = new ArrayList<>();
        // TO COMPLETE ...
        
        try {
            sc = new Scanner(f);
        } 
        catch (FileNotFoundException e) {
            System.err.println("File does not exists " + e.getMessage());
            System.exit(0);
        }
                
        // Reading file, adding lines to the list
        
        while (sc.hasNextLine()) {
            l.add(sc.nextLine());
        }
        Collections.sort(l);
        // Sorting the list, writing it to console
        System.out.println(l.toString());
        // TO COMPLETE ...
    }     
}