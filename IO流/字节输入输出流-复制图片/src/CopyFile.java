import java.io.*;

/**
 * 复制文件
 */
public class CopyFile {

    public static void main(String[] args) {
        // 文件路径
        String courseFile = "";
        try {
            // 获取项目路径 D:\LearnJava\IO流\demo
            courseFile = new File("").getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fromFilePath = courseFile + "\\src\\logo.png";
        String toFilePath = courseFile +"/src/logo1.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            // 字节输入流
            fileInputStream = new FileInputStream(fromFilePath);
            // 字节输出流
            fileOutputStream = new FileOutputStream(toFilePath);
            // 一次最大读取的长度
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                // 读一次，写一次 写入读取的长度
                fileOutputStream.write(buffer, 0, readLen);
            }
            System.out.println("ok!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 后用的先关
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
