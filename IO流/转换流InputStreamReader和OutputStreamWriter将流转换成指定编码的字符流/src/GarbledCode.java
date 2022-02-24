import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 出现乱码
 * BufferedReader读取 ANSI编码文本文件出现 乱码
 */
public class GarbledCode {

    public static void main(String[] args) {
        // utf8编码文件
        String filePath = "src\\a.txt";
        // ANSI编码文件，在不同的系统中，ANSI表示不同的编码
        String filePath2 = "src\\b.txt";
        demo01(filePath); // hello,zichen!你好，子辰！
        // 中文乱码
        demo01(filePath2); // hello,zichen!��ã��ӳ���
    }

    /**
     * 读取字符文件
     * BufferedReader 默认以 utf8 编码读取
     * @param filePath 读取文件的路径
     */
    private static void demo01(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
