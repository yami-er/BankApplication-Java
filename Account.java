public abstract class Account implements IBaseRate{
   //list common properities for saving and checking
   String name;
   String sSN;
   double balance;
   static int index = 10000;
   protected String accountNumber;
   protected double rate;
   //constractor to set base properties and intialize the account
   public Accout(String name,String sSN, double initDeposit){
       this.name= name;
       this.sSN = sSN;
       balance = initDeposit;

    //set account number
        index++;   
        this.accountNumber = setAccountNumber();
        setRate();
   }
   public abstract void setRate();
    
    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length() -2, sSN.length());
        int uniqueID = index;
        int randomNumber =(int) Math.random() * Math.pow(10,3);
        return lastTwoOfSSN + uniqueID + randomNumber ;
    }
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accuredInterest;
        System.out.println("Accured Interest:" + accuredInterest);
        printBalance();

    } 
   //list common methods
   public void deposit(double amount){
       balance = balance + amount;
       System.out.println("Depositing $" + amount);
       printBalance();

   }
   public void withdrow(double amount){
       balance = balance - amount;
       System.out.println("Withdrowing $" + amount);
       printBalance();
   }
   public void transfer(String toWhere,double amount){
       balance = balance -amount;
       System.out.println("Transfering $"+ amount);
       printBalnce();
   }
   public void printBalance(){
       System.out.println("your balance is now:"+ balance);
       printBalnce();
   }
   public void showInfo(){
       System.out.println(
           "NAME:" + name +
           "\nACCOUNT NUMBER:" + accountNumber +
           "\nBALANCE: + balance" +
           "\nRATE:" + rate + "%"

       );
   }

}