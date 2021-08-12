package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("IMPFile.txt");
                String Str = ("Everything is fine");
                byte[] arr = Str.getBytes();
                fileOutputStream.write(arr);
                System.out.println("File is written Successfully");
                fileOutputStream.close();


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
    }

