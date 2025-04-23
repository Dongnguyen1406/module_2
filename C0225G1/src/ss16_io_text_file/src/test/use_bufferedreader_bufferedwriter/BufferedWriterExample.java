package test.use_bufferedreader_bufferedwriter;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/use_bufferedreader_bufferedwriter/output.txt"))){
            bw.write("Hello, this is a test text."); // ghi một chuỗi 
            bw.newLine(); // chèn một dòng mới
            bw.write("Another line."); // ghi thêm một dòng khác
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
