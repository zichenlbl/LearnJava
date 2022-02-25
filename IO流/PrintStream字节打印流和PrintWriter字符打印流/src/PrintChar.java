import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 字符打印流PrintWriter
 * 打印流只有输出流
 */
public class PrintChar {

    public static void main(String[] args) {
        // 1. System.out 打印到默认设备显示器
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hello world!");
        printWriter.write(new char[]{'a', 'b'});
        // 关闭流或者刷新才可以把数据打印出
        printWriter.flush();
        printWriter.close();

        // 2. 打印到指定的文件中
        try {
            printWriter = new PrintWriter("d:\\f.txt");
            printWriter.println("hello zichen!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }

        // 3. 设置 autoFlush 为 true ,则 println\printf\format 方法将刷新输出缓冲区
        // 调用其中一种方法或写入换行符或字节 ( '\n')时，都会刷新输出缓冲区
        // printf 底层是 format
        try {
            printWriter = new PrintWriter(new FileWriter("d:\\g.txt"), true);
            printWriter.println("hello world!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

}
