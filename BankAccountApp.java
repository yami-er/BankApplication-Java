import java.io.FileDescriptor;
import java.util.List;
import util.LinkedList;

public class BankAccountApp {
public static void main(String[] args) {
    List<Account> accounts = new LinkedList<Account>();
    //read a csv file 
    String file = "C:\\WIN2020\\java\\UdemyBank\\original.csv";
    List<String[]> newAccountHolders = utilities.CSV.read(file);
    for(String[] accountHolder: newAccountHolders){
        String name = accountHolder[0];
        String sSN = accountHolder[1];
        String accountType = accountHolder[2];
        double initDeposit = Double.parseDouble(accountHolder[3]);
        if(accountType.equals("Saving")){
            
            account.add(new Saving(name + " "+ sSN +" "+ " "+ "$"+initDeposit));
        }else if(accountType.equals("Checking")){
            
            account.add(new Checking(name,sSN, initDeposit));
        }else{
            System.out.println("error reading account type");
        }
    }
    for(Account acc: accounts){
        System.out.println("\n*********");
        acc.showInfo();
    }

}

}