import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      int i = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data + i);
        i++;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
