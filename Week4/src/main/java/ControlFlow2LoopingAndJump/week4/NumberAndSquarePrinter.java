
package ControlFlow2LoopingAndJump.week4;

/**
 *
 * @author _parall_el
 */
public class NumberAndSquarePrinter {

    public static void main(String[] args) {
        //  Basic: Number & Square Printer
        int count = 20; // changed from 10
        
        System.out.println("~=~=~=~=~ NUMBER AND SQUARE PRINTER ~=~=~=~=~");
        for(int i = 1; i <= count; i++){
            System.out.println("Number: " + i + " Square: " + (i * i));
        }
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
    }
}
