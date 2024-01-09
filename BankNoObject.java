class BankNoObject {
    public static void main(String[] args) {
        // making my account
        String myName = "MrN";
        int myBalance = 100;
        // those variables are in no way connected to one another
        myBalance = Bank.deposit(myBalance, 50);
        myBalance = Bank.withdraw(myBalance, 2000);
        myBalance = Bank.withdraw(myBalance, 20);
    
        // making another account
        String yourName = "Chris";
        int yourBalance = 200;
        yourBalance = Bank.deposit(yourBalance, 10);
    
    
        // I (or anyone) can easily access or change my balance!
        System.out.println(myBalance);
        myBalance = 10000000;
    
    }
} // close Main class
  
  
  
  
class Bank{
  
    public static int deposit(int balance, int amt){
        int ans = balance + amt;
        System.out.println("the new balance is " + ans);
        return ans;
    }
  
    public static int withdraw(int balance, int amt){
        if (balance - amt > 0){
            int ans = balance - amt;
            System.out.println("your new balance is " + ans);
            return ans;
        }
        else{
            System.out.println("insufficient funds");
            return balance;
        }
    }
  
} // close Bank class