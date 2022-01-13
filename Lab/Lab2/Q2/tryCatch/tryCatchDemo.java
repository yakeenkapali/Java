import java.io.FileNotFoundException;
import java.io.FileReader;

class tryCatchDemo{
  public static void main(String[] args){
  try{
      FileReader file = new FileReader("newFile.txt");
  }catch(FileNotFoundException e){
    System.out.println(e.getMessage());
  }
  
}}