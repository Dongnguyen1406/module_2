package bai_tap.product_manager_to_file_binary.util;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToBinaryFile {
    public static void writeFile(String filePath, List<String> stringList, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append); // append true để ghi tiếp vì nếu k sẽ bị ghi đè
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }

    public static List<String> readFile(String filePath){
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){ // đọc từng dòng 
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e){
            System.out.println("Lỗi đọc file");
        } finally {
            // đóng luồn file
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");            }

        }
        return stringList;
    }
}
