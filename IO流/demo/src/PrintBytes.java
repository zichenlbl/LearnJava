import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 字节打印流PrintStream
 * 打印流只有输出流
 */
public class PrintBytes {

    public static void main(String[] args) {
        // 1. System.out 是字节打印流
        PrintStream out = System.out;
        // 默认打印输出位置是 标准输出，即显示器
        out.println("hello world!");
        // println 底层是 print, print 底层是 write
        // 所以可以直接用write打印
        try {
            out.write("zichen".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭打印流
        out.close();

        // 2. 可以修改打印输出的位置
        try {
            out = new PrintStream("d:\\d.txt");
            out.print("hello zichen!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            out.close();
        }

        // 3. 设置System的打印位置
        try {
            out = new PrintStream("d:\\e.txt");
            System.setOut(out);
            System.out.println("hello zichen!");
            /*
                public static void setOut(PrintStream out) {
                    checkIO();
                    setOut0(out);
                }
                private static native void setOut0(PrintStream out);
                native关键字说明其修饰的方法是一个原生态方法，方法对应的实现不是
                在当前文件，而是在用其他语言（如C和C++）实现的文件中。
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            out.close();
        }
    }

}
