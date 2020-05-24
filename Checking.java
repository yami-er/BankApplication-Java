public class Checking extends Account{
   //list properties for checking accounts
   private int debitCardNumber;
   private int debitCardPin;
   //constractor to initialize the checking account 
   public Checking (String name, String sSN, double initDeposit){
    super(name,sSN, initDeposit);
    accountNumber = "2" + accountNumber;
    setDebitCard(); 
   }
   @Override
   public void setRate(){
       rate = getBaseRate() * .15;
   }
   //list any method specific to checing account 
   private void setDebitCard(){
       debitCardNumber = (int)(Math.random()*Math.pow(10,12));
       debitCardPin = (int)(Math.random()* Math.pow(10,4));

   }
   public void showInfo(){
       super.showInfo();
      System.out.println("Your Checking Accoutn Features"+
            "\n Debit Card Number:" + debitCardNumber +
            "\n Debit Card Pin" + debitCardPin
      );

   }
}