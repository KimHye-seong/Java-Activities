
package ControlFlow1DecisionMaking.week3;

/**
 *
 * @author _parall_el
 */
public class NestedLoginValidator {
    public static void main(String[] args) {
    // Advanced: Nested Login Validator
        String userName = "parall_el"; // userName = "Parallel", for failing
        String password = "ElgaveGamba57"; // password = "elgavegamba57", for failing
        Boolean accountEnabled = true; // accountEnabled = false, for account is locked
        
        System.out.println("\n<~=~=~> NESTED LOGIN VALIDATOR <~=~=~>\n");
        if(userName.equals("parall_el")){
            if(password.equals("ElgaveGamba57")){
                if(accountEnabled){
                    System.out.println("\nAccount is not locked. Login Successful.\n");
                    System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
                }else{
                    System.out.println("\nThis account is locked.\n");
                    System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
                }
            }else{
                System.out.println("\nWrong Password.\n");
                System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
            }
        }else{
            System.out.println("\nWrong Username.\n");
            System.out.println("\n<~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~>\n");
        }
    }
}
