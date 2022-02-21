import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter 处理流写入字符到文本文件
 */
public class WriteFile {

    public static void main(String[] args) {
        String filePath = "d:\\fileWriter.txt";
        BufferedWriter bufferedWriter = null;
        try {
            // 追加写入true
            FileWriter fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            // 写入一个ASCII码对应的字符
            bufferedWriter.write(97);
            // 写入一个字符
            bufferedWriter.write("你好");
            // 从字符串下标为1开始写1个长度
            bufferedWriter.write("你好", 1, 1);
            // 插入一个当前操作系统的换行
            bufferedWriter.newLine();
            // 写入一个字符数组
            bufferedWriter.write(new char[]{'h', 'e', 'l', 'l', 'o'});
            // 从字符数组下标为2开始写2个长度
            bufferedWriter.write(new char[]{'h', 'e', 'l', 'l', 'o'}, 2, 2);
            /**
             * 结果为
             * a你好好
             * helloll
             */
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭处理流会自动关闭节点流
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
