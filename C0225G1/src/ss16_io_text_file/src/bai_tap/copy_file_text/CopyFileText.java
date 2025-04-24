package bai_tap.copy_file_text;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập đường dẫn tập tin nguồn: ");
        String sourcePath = sc.nextLine();
        System.out.println("Nhập đường dẫn tập tin đính: ");
        String targetPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại !");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("Tập tin đính đã tồn tại !");
        }

        int charCount = 0;

        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(targetFile)
        ) {
            int character;
            while ((character = reader.read()) != -1){
                writer.write(character);
                charCount++;
            }
            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file " + e.getMessage());        }
    }
}
