import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 读取utf-8编码的文件，写入gbk编码文件
 */
public class CopyFile {

    public static void main(String[] args) {
        //升级版
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = 									//高效的用指定的编码表读
                new BufferedReader(new InputStreamReader(new FileInputStream("src\\a.txt"), StandardCharsets.UTF_8));
            bw = 									//高效的用指定的编码表写
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\d.txt"), "GBK"));
            String ch = "";
            while((ch = br.readLine()) != null) {
                bw.write(ch);
                bw.newLine();
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
