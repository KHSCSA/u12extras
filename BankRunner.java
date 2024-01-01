class BankRunner {
    public static void main(String[] args) {
        // my account
        Bank myAcct = new Bank("MrN", 100);
        // the attributes are 'bound' to the object!!
        myAcct.deposit(200);
        myAcct.withdraw(2000);
        myAcct.withdraw(20);

        // another account
        Bank acct2 = new Bank("Chris", 200);


        // the attributes are 'private'!!
        //System.out.println(myAcct.balance);
        //myAcct.balance = 10000000;
        System.out.println(myAcct.getBalance());

    }
} // close Main



class Bank{
    private int balance;
    private String name;

    public Bank(String nameParam, int amtParam){
        this.name = nameParam;
        this.balance = amtParam;
    }

    public void deposit(int amt){
        this.balance = this.balance + amt;
        System.out.println(this.name + " has a new balance of " + this.balance);
    }

    public void withdraw(int amt){
        if (this.balance - amt > 0){
        this.balance = this.balance - amt;
        System.out.println(this.name + " has a new balance of " + this.balance);
    }
    else
        System.out.println("Insufficient funds");
    }

    // because the attributes are 'private'
    // you must use a method to 'get' the value
    public int getBalance(){
        return this.balance;
    }

}