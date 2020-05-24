import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

//import sun.tools.tree.IncDecExpression;
public class CSV {
    // this method will read csv file and return list

    public static List<String[]> read(String file){
            List<String[]> data = new LinkedList<String[]>();
            String dataRow;
            try{
                BufferedReader br = new BufferedReader(new FileReader(file));

                while((dataRow = br.readLine()) != null){
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
                }

            }catch(FileNotFoundException e){
                System.out.println("could not find file");
                e.printStackTrace();
            }catch( IOException e){
                System.out.println("couldnot read file");
                e.printStackTrace();
            } 
            return data; 
            
        }

}
