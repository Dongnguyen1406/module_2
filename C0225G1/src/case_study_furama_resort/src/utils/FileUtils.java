package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
        return list;
    }

    public static void writeFile(String path, String content, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append))) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }

    public static void writeFile(String path, List<String> contents, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append))) {
            for (String line : contents) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }
}
