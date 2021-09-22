import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        // first create new file
        File file = new File("F:\\MyWork\\FullJavaStack\\Practice\\File_Handling\\FileTest.txt");

        if(file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exist");
        }

        // Write content in files
        FileWriter writer = new FileWriter(file);
        writer.write("Adding a content here for testing");;
        writer.close();

        // Create new string to append to the file above
        FileWriter fileAppend = new FileWriter(file,true);
        String appendString = "\nThis text should be append to the file";
        fileAppend.write(appendString);
        fileAppend.close();

        // Read content inside file
        Scanner readFile = new Scanner(file);
        while (readFile.hasNextLine()) {
            String data = readFile.nextLine();
            System.out.println(data);
        }
        readFile.close();
    }
}
