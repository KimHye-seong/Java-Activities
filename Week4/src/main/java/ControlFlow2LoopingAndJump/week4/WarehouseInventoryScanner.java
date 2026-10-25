
package ControlFlow2LoopingAndJump.week4;

/**
 *
 * @author _parall_el
 */
import java.util.Scanner;
public class WarehouseInventoryScanner {
    
    static final int lowLimit = 7;
    
    static int totalInventory(int[][] warehouse){
        int total = 0;
        
        for(int r = 0; r < warehouse.length; r++){
            for(int c = 0; c < warehouse[r].length; c++){
                if(warehouse[r][c] == -1){
                    continue; // skip damaged shelf
                }
                total += warehouse[r][c];
            }
        }
        return total;
    }
    
    static void findLowShelf(int[][] warehouse){
        boolean found = false;
        
        for(int r = 0; r < warehouse.length; r++){
            for(int c = 0; c < warehouse[r].length; c++){
                if(warehouse[r][c] != -1 && warehouse[r][c] < lowLimit){
                    System.out.println("First critically low shelf: row " + r 
                            + ", column " + c + " (count: " + warehouse[r][c] + ")");
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("No critically low shelves.");
        }
    }
    
    static void restock(int[][] warehouse, Scanner jarvis){
        System.out.println("Enter row (0-" + (warehouse.length - 1) + "): ");
        if(!jarvis.hasNextInt()){
            jarvis.next();
            System.out.println("Invalid input.");
            return;
        }
        int row = jarvis.nextInt();
        
        if(row < 0 || row >= warehouse.length){
            System.out.println("Row out of range.");
            return;
        }

        System.out.print("Enter column (0-" + (warehouse[row].length - 1) + "): ");
        if(!jarvis.hasNextInt()){
            jarvis.next();
            System.out.println("Invalid input.");
            return;
        }
        int column = jarvis.nextInt();

        if(column < 0 || column >= warehouse[row].length){
            System.out.println("Column out of range.");
            return;
        }

        if(warehouse[row][column] == -1){
            System.out.println("That shelf is damaged and cannot be restocked.");
            return;
        }

        // WHILE: keeps asking until the quantity is valid (greater than 0)
        int quantity = 0;
        while (quantity <= 0) {
            System.out.print("Enter quantity to add: ");
            if (!jarvis.hasNextInt()) {
                jarvis.next(); // discard bad input
                System.out.println("Please enter a number.");
                continue;
            }
            quantity = jarvis.nextInt();
            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0.");
            }
        }

        warehouse[row][column] += quantity;
        System.out.println("Restocked! New count at row " + row + ", column " + column
                + ": " + warehouse[row][column]);
        return; // RETURN: restocking finished, back to the menu
    }
    
    public static void main(String[] args) {
        // Expert: Warehouse Invetory Scanner
         Scanner jarvis = new Scanner(System.in);
        
        int[][] warehouse = {
            {12,  8, -1, 20},
            { 3, 15,  9,  7},
            {-1,  6, 10, 10}
        };
        int choice;
        
        do{
            System.out.println("\n<~=~=~> WAREHOUSE INVETORY SCANNER <~=~=~>");
            System.out.println("1. Total inventory");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            if(jarvis.hasNextInt()){
                choice = jarvis.nextInt();
            }else{
                jarvis.next(); // discard bad input
                choice = 0;   // forces "Invalid choice" below
            }

            switch(choice){
                case 1:
                    System.out.println("Total inventory: " + totalInventory(warehouse));
                    break;
                case 2:
                    findLowShelf(warehouse);
                    break;
                case 3:
                    restock(warehouse, jarvis);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 to 4.");
            }
        }while(choice != 4);
        System.out.println("<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");

        jarvis.close();
    }
}
