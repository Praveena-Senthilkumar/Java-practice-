import java.util.*;
import java.io.File;
import fw;
public class Fileread {
    public static void main(String[] args){
          try{
              File f=new File("file.txt");
              FileWriter fw=new FileWriter(f);
              fw.write("hello programmers");
        }
        catch(){
            
        }

        try{
            File f = new File("file.txt");
          
            Scanner rd = new Scanner(f);
            while(rd.hasNextLine()){
                System.out.println(rd.nextLine());
            }
            rd.close();
        }
        catch(Exception e){
            System.out.print(e);
        }

      
    }
}