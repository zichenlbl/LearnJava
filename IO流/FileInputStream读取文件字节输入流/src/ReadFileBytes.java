import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream 文件字节输入流
 */
public class ReadFileBytes {

    public static void main(String[] args) {
        demo01();
        System.out.println();
        demo02();
    }

    /**
     * 一个字节一个字节读取，速度慢
     */
    private static void demo01() {
        String filePath = "D:\\a.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            int readData = 0;
            // 读取一个字节，有数据就返回这个字节，否则返回-1
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 规定一次最多读取的字节数
     */
    private static void demo02() {
        String filePath = "D:\\a.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            // 一次最多可以读取的字节数
            byte[] buf = new byte[8];
            // 这一次读取了几个字节
            int readLen = 0;
            // 读取一个字节，有数据就返回这个字节，否则返回-1
            while ((readLen = fileInputStream.read(buf)) != -1) {
                // 字节解码为字符串
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
