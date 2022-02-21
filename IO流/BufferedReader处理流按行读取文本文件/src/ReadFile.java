import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader 处理流按行读取文本文件
 */
public class ReadFile {

    public static void main(String[] args) {
        String filePath = "d:\\fileReader.txt";
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            // BufferedReader需要一个Reader类型的参数
            bufferedReader = new BufferedReader(fileReader);
            // BufferedReader可以一次读取一行
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 处理流关闭时，会自动关闭节点流
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
