import java.io.*;

/**
 * 使用BufferedReader和 BufferedWriter拷贝文本文件
 */
public class CopyFile {

    public static void main(String[] args) {
        // Reader和Writer只能操作字符文件，不能操作二进制文件，会无法打开
        String fromFilePath= "d:\\fileReader.txt";
        String toFilePath= "d:\\copyFileReader.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fromFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(toFilePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                // 写入一行
                bufferedWriter.write(line);
                // 换一行
                bufferedWriter.newLine();
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
