
package ControlFlow1DecisionMaking.week3;

/**
 *
 * @author _parall_el
 */
public class MutliTierDiscountSystem {
    public static void main(String[] args) {
    // Intermediate: Multi-tier Discount System
        double purchaseAmount = 1180.00; // for 15% discount
            /*
                purchaseAmount = 880.00, for 10% discount
                purchaseAmount = 580.00, for 5% discount
                purchaseAmount = 180.00, for no discount
            */       
        double discount, finalPrice;
        
        System.out.println("\n<~=~=~> MULTI-TIER DISCOUNT SYSTEM <~=~=~>\n");
        
        if(purchaseAmount >= 1000){
            discount = purchaseAmount * .15;
            finalPrice = purchaseAmount - discount;
            System.out.println("Assigned Discount Tier: 15%");
            System.out.println("Final Discounted Price: " + finalPrice);
        }else if(purchaseAmount >= 800){
            discount = purchaseAmount * .10;
            finalPrice = purchaseAmount - discount;
            System.out.println("Assigned Discount Tier: 10%");
            System.out.println("Final Discounted Price: " + finalPrice);
        }else if(purchaseAmount >= 500){
            discount = purchaseAmount * .05;
            finalPrice = purchaseAmount - discount;
            System.out.println("Assigned Discount Tier: 5%");
            System.out.println("Final Discounted Price: " + finalPrice);
        }else{
            System.out.println("Assigned Discount Tier: 0%");
            System.out.println("Final Price: " + purchaseAmount);
        }
        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
    
}
