package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {
    public static void main(String[] args) throws Exception {

        //To create a new file
        File myFile = new File("File1.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create new file");
            e.printStackTrace();
        }

    //to check whether the file exists or not.
        if(myFile.exists()){
            System.out.println("File Exists");
        }else {
            System.out.println("Does not exist");
        }


        //To write something in file.
                FileWriter fileWriter = new FileWriter("File1.txt");
        try {
            fileWriter = new FileWriter("File1.txt");
            fileWriter.write("Bonjour a tous.Comment allez-vous ? j'espere que vous allez bien. \n Au Revoir");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot write in a file");
            e.printStackTrace();
        }



        //to read something bfrom a file.
        File myFile1 = new File("File1.txt");
        Scanner sc = new Scanner(myFile1);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();


    }
}
