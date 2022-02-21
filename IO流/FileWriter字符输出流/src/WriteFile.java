import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 字符输出流写入文件
 */
public class WriteFile {

    public static void main(String[] args) {
        String filePath = "d:\\fileWriter.txt";
        FileWriter fileWriter = null;
        try {
            // 追加写入
            fileWriter = new FileWriter(filePath, true);
            // 写入单个字符
            fileWriter.write('A');
            // 写入char数组
            char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
            fileWriter.write(chars);
            // 写入指定数组的开始部分与写入长度
            fileWriter.write(chars, 2, 2);
            // 写入字符串
            fileWriter.write("字符串");
            // 写入指定字符串的开始部分与写入长度
            fileWriter.write("字符串", 1, 1);
            // 结果为Aabcdefcd字符串符
            // 循环操作
            for (int i = 0; i < 10; i++) {
                fileWriter.write("\n" + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    // FileWriter使用后需要关闭(close)或者进行刷新(flush)才能将缓冲区的数据写入到文件中
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
