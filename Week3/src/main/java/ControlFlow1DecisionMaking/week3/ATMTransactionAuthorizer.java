
package ControlFlow1DecisionMaking.week3;

/**
 *
 * @author _parall_el
 */
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
    // Expert: ATM Transaction Authorizer
        String username = "_parall_el";
        int pin = 6767;
        double balance = 670000.67;
        double withdrawalAmount = 200000.00;

        String tier;
        double feePercentage;
        double dailyLimit;

        System.out.println("<~=~=~> ATM TRANSACTION AUTHORIZER <~=~=~>");

        if(username.equals("_parall_el")){
            if(pin == 6767){
                if(balance >= 1000000.00){
                    tier = "Platinum";
                }else if(balance >= 500000.00){
                    tier = "Gold";
                }else if(balance >= 200000.00){
                    tier = "Silver";
                }else{
                    tier = "Bronze";
                }

                switch(tier){
                    case "Platinum":
                        feePercentage = 0.00; // 0% fee
                        dailyLimit = 500000.00;
                        break;
                    case "Gold":
                        feePercentage = 0.01; // 1% fee
                        dailyLimit = 300000.00;
                        break;
                    case "Silver":
                        feePercentage = 0.02; // 2% fee
                        dailyLimit = 150000.00;
                        break;
                    case "Bronze":
                        feePercentage = 0.03; // 3% fee
                        dailyLimit = 50000.00;
                        break;
                    default:
                        feePercentage = 0.03;
                        dailyLimit = 0.00;
                }
        
                System.out.println("Account Tier: " + tier);
        
                double feeAmount = withdrawalAmount * feePercentage;
                double totalRequired = withdrawalAmount + feeAmount;
        
                if(withdrawalAmount <= dailyLimit){
                    if(balance >= totalRequired){
                        balance -= totalRequired;
                        System.out.println("Status: TRANSACTION APPROVED");
                        System.out.println("Withdrawal Amount: " + withdrawalAmount);
                        System.out.println("Transaction Fee Applied: " + feeAmount);
                        System.out.printf("Remaining Balance: %.2f", balance);
                    }else{
                        System.out.println("Status: TRANSACTION DENIED");
                        System.out.println("Reason: Insufficient balance to cover withdrawal amount plus the transaction fee.");
                    }
                }else{
                    System.out.println("Status: TRANSACTION DENIED");
                    System.out.println("Reason: Requested amount exceeds your tier's daily limit.");
                }
            }else{
                System.out.println("Status: TRANSACTION DENIED");
                System.out.println("Reason: Incorrect PIN.");
            }
        }else{
            System.out.println("Status: TRANSACTION DENIED");
            System.out.println("Reason: Incorrect Username.");
        }

        System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
    }
}
