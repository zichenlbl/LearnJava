import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 普通方式读取配置文件
 * 使用文件字符流 读取配置文件
 */
public class ReadConfigurationFile {

    public static void main(String[] args) {
        // 读取mysql.properties文件，获取uername、password、age
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
            String lineRead;
            while ((lineRead = bufferedReader.readLine()) != null) {
                // 读取第一行，解析，以=号分割成数组
                String[] split = lineRead.split("=");
                // 获取
                if ("username".equals(split[0])) {
                    System.out.printf("%s = %s\n", split[0], split[1]);
                }
                if ("password".equals(split[0])) {
                    System.out.printf("%s = %s\n", split[0], split[1]);
                }
                if ("age".equals(split[0])) {
                    System.out.printf("%s = %s", split[0], split[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭外部流
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
