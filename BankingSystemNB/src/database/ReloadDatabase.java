package database;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReloadDatabase {
    
    String fileName = "/Users/Jordan/Projects/OOP/BankingSystemNB/src/database/DBBuilder";
    public String content;
    SQLDriver db = new SQLDriver();
    
    public ReloadDatabase(){
        try{
            content = this.readFile(fileName);
            String statement = content;
            db.insert(statement);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    static String readFile(String path)throws IOException{
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded);
    }
    
    public void printDirectory(){
        //For Testing - Ensures FilePath
        File folder = new File("/Users/Jordan/Projects/OOP/BankingSystemNB/src/database/");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
          if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());
          } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Directory " + listOfFiles[i].getName());
          }
        }
}
    
    
}
