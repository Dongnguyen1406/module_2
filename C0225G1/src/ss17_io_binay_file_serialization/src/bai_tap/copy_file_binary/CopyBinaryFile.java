package bai_tap.copy_file_binary;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        
        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }
        
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại. Ghi đè...");
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công! Tổng số byte: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
