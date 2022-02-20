import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件字节输出流  创建文件写入文本
 */
public class WriteFileBytes {

    public static void main(String[] args) {
        String filePath = "d:\\write.txt";
        FileOutputStream fileOutputStream = null;
        String str = "hello!";
        try {
            // 文件字节输出流
            fileOutputStream = new FileOutputStream(filePath);
            // 1. 写入一个字符
            fileOutputStream.write('A');
            // 2. 写入一个字符串
            // 转为字节数组
            fileOutputStream.write(str.getBytes());
            // 结果为Ahello!
            // 3. 写入一个范围的大小，字节数组的起始位置、写入长度
            fileOutputStream.write(str.getBytes(), 1, 2);
            // 结果为Ahello!el
            // 4. 写入在已有文件中追加
            // true: 写入时，在已有文件后面追加
            fileOutputStream = new FileOutputStream(filePath, true);
            fileOutputStream.write(str.getBytes(), 0, str.length());
            // 结果为Ahello!elhello!
            System.out.println("ok!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
