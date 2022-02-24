import java.io.*;

/**
 * 保存指定编码的文本文件
 * OutputStreamWriter将字节输出流 包装成指定编码的 字符输出流
 */
public class SaveCharsetNameFile {

    public static void main(String[] args) {
        String filePath = "src\\c.txt";
        String charSet = "gbk";
        BufferedWriter bufferedWriter = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charSet);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("hello,zichen!");
            bufferedWriter.newLine(); // 写入一个换行
            bufferedWriter.write("你好，子辰！");
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
