import java.io.*;

/**
 * 使用BufferedInputStream和Output拷贝视频文件
 */
public class CopyVideo {

    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        String fromFilePath = "d:\\test.mp4";
        String toFilePath = "d:\\testCopy.mp4";
        try {
            FileInputStream fileInputStream = new FileInputStream(fromFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(toFilePath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int readLen = 0;
            byte[] buffer = new byte[1024];
            while ((readLen = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, readLen);
            }
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
