import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
      public static void main(String[] args) {
            runCollections runCollection = new runCollections();

    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      int i = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data + i);
        runCollection.addRunString(data);
        i++;
      }
      runCollection.sortTheIcons(0);
      runCollection.printRuns();
              writeFinal.editFile(runCollection);

      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
