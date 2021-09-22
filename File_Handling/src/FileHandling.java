import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        // This code should read, write and append file //

        // first create new file
        File file = new File("F:\\MyWork\\FullJavaStack\\Practice\\File_Handling\\FileTest.txt");
        boolean createFile;

        if(file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exist");
        }

        // Write content in files
        FileWriter writer = new FileWriter(file);
        writer.write("Adding a content here for testing");;
        writer.close();

        Scanner readFile = new Scanner(file);
        while (readFile.hasNextLine()) {
            String data = readFile.nextLine();
            System.out.println(data);
        }
        readFile.close();

//        try {
//
//        FileWriter fileWriter = new FileWriter("testing.txt");
//        } catch (IOException e) {
//        System.out.println("An Error occurred");
//        e.printStackTrace();
//        }
    }
}
