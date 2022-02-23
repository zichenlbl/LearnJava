import java.util.Scanner;

/**
 * 标准输入输出流System.in与System.out
 */
public class StandardInputOutputStream {

    public static void main(String[] args) {
        // 标准输入流 public final static InputStream in = null;
        // 运行时类型 class java.io.BufferedInputStream
        System.out.println(System.in.getClass());
        // 标准输出流 public final static PrintStream out = null;
        // 运行时类型 class java.io.PrintStream
        System.out.println(System.out.getClass());

        // 使用标准输入流获取键盘输入
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        // 使用标准输出流将数据显示到显示器
        System.out.println(next);
    }

}
