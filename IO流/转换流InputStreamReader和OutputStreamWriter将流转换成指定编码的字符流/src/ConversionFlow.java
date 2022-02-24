import java.io.*;

/**
 * 字节流转换成字符流，再读取，解决中文乱码
 * InputStreamReader将字节输入流 包装成指定编码的 字符输入流
 */
public class ConversionFlow {

    public static void main(String[] args) {
        String filePath = "src\\b.txt";
        BufferedReader bufferedReader = null;
        try {
            // 文件字节输入流
            FileInputStream fileInputStream = new FileInputStream(filePath);
            // 包装，把字节流读取的字节进行缓冲而后在通过字符集解码成字符返回
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "gbk");
            // 使用包装流读取
            bufferedReader = new BufferedReader(inputStreamReader);
            String s = bufferedReader.readLine();
            System.out.println(s); // hello,zichen!你好，子辰！
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭外层流
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
