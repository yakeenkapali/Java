import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class finallyDemo {

  public static void main(String[] args) {
    try {
    FileReader file = new FileReader("newFile.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      File file = new File("newFile.txt");
      if (!file.exists()) {
        try{
          file.createNewFile();
          System.out.println("\n New file created.");
        }catch(IOException e){
          System.out.println(e.getMessage());
        }
		  }
    
    }
  }
}