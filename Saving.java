public class Saving extends Account{
   //list properties for saving accounts
   private int saftyDepositBoxId;
   private int saftyDepositBoxKey;
   //constractor to initialize the saving account property
   public Saving(String name,String sSN, double initDeposit){
       super(name,sSN, initDeposit);
       accountNumber = "1" + accountNumber;
       setSaftyDepositBox(); 
   }

   @Override
   public void setRate(){
       rate = getBaseRate() - .25;
    
       
   }

   private void setSaftyDepositBox(){
       saftyDepositBoxId =(int) (Math.random() * Math.pow(10,3));
       saftyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));

   }

   //list method specific to saving 
   public  void showInfo(){
       super.showInfo();
       System.out.println(
           "your saving account features" +
           "\n Safety Deposit Box Id:" + saftyDepositBoxId +
           "\n Safety Deposit Box Key:" + saftyDepositBoxKey
       );
   }
   
}