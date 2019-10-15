package Pract3;


/**
 * class WrapperClassesUse.
 * 
 * @author LTP 
 * @version 2018-19
 */

public class WrapperClassesUse {        
    public static void main(String[] args) {            
		// Assignment of wrapper variables to elementary types 
        int i = new Integer(123456);		
        char c = new Character('c');
        byte b = new Byte((byte) 127);
        short s = new Short((short) 100);
        float f = new Float(1.0f);
        boolean bol = new Boolean(true);
        long l = new Long(2l);
        
            
        // Writing elementary variables
		System.out.println("int i = " + i);
		System.out.println("char c  = " + c);
		System.out.println("byte b = " + b);
		System.out.println("short s = " + s);
		System.out.println("float f = " + f);
		System.out.println("boolean bol = " + bol);
		System.out.println("long l = " + l + "\n");
        // TO COMPLETE ...
               
		// Assignment of elementary values to wrapper variables
		Integer eI = 123456; 
		Character cI = 'c';
		Byte bI = 127;
		Short sI = 100;
		Float fI = 1.0f;
		Boolean bolI = false;
		Long lI = 2l;
        // TO COMPLETE ...
            
        // Writing wrapper variabless
		System.out.println("Integer I = " + eI);
		System.out.println("Character cI = " + cI);
		System.out.println("Byte bI  = " + bI);
		System.out.println("Short sI = " + sI);
		System.out.println("Float fI = " + fI);
		System.out.println("Boolean bolI  = " + bolI);
		System.out.println("Long lI = " + lI);
		
        // TO COMPLETE ...
    }    
}