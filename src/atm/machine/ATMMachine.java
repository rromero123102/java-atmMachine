
package atm.machine;
import java.util.Scanner;



public class ATMMachine {
    
    
    private static Scanner kb = new Scanner(System.in);
 
    
    public static void main(String[] args) {
        String userName = kb.nextLine();
        int pin = kb.nextInt();
        double totalMoney = 0.0;
        
        System.out.println("Hello " + userName + " what would like to do today? You currently have $" + totalMoney + " in your account!");
        System.out.println("COMMANDS:\n deposit: type to deposit a check\nwidthdraw: type to widthdraw money");
        
    }
    
    
    public static String userCheck(String accountName){
        
        
        
        return "";
    }
    
    
    public static double deposit(double preDeposit){
        double postDeposit;
        double depositAmount = 0.0;
        
        postDeposit = preDeposit + depositAmount;
        
        return postDeposit;
    }
    
    
    
}
