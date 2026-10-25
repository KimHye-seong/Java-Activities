
package Arrays.week5;

/**
 *
 * @author _parall_el
 */
public class FavoriteThingsArray {
    public static void main(String[] args) {
        // Basic: Favorite Things Array
        String[] favorite = {
            "Favorite things to wear: Dark Colors/Shades Clothes", 
            "Favorite things to do: Playing, Watching, Coding, My Daily Routine, & Sleeping", 
            "Favorite things to eat: Protein Foods", 
            "Favorite things to collect: Devices, Clothes, & Stationary Holder",
            "Favorite things to master: Coding, Hackathon, & Quick Problem Solving"
        };
        
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~ FAVORITE THINGS ARRAY ~=~=~=~=~=~=~=~=~=~=~=~=~");
        for(int i = 0; i < favorite.length; i++){
            System.out.println((i + 1) + ". " + favorite[i]);
        }
        
        System.out.println("\nTotal length: " + favorite.length);
        System.out.println("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
        }
    }
