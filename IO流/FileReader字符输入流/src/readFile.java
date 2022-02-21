/**
 * 字符输入流读取文件
 */
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    public static void main(String[] args) {
        String filePath = "d:\\fileReader.txt";
        demo01(filePath);
        demo02(filePath);
    }

    /**
     * 一次单个字符读取
     * @param filePath 读取的文件路径
     */
    private static void demo01(String filePath) {
        FileReader fileReader = null;
        try {
            int character = 0;
            fileReader = new FileReader(filePath);
            // read()方法 Returns: 已读取字符，如果达到流的结尾返回-1
            //The character read, or -1 if the end of the stream has been reached
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 一次多个字符读取
     * @param filePath 读取的文件路径
     */
    private static void demo02(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            char[] buffer = new char[8];
            int readLen = 0;
            // 方法返回读取的字符数
            // The number of characters read, or -1 if the end of the stream has been reached
            while ((readLen = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLen));
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
