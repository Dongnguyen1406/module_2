package test.use_filereader_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/test/use_filereader_filewriter/output.txt")){
            fw.write("Hello, this is a test text.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
