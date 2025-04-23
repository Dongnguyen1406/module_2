package test.use_bufferedreader_bufferedwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/test/use_bufferedreader_bufferedwriter/input.txt"))){
            String line;
            while((line = br.readLine()) != null){ // đọc theo dòng
                System.out.println(line); // in ra từng dòng
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
