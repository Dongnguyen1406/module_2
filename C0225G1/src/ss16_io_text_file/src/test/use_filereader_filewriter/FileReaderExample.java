package test.use_filereader_filewriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/test/use_filereader_filewriter/input.txt")){
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
