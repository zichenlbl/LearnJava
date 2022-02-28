import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties配置文件类读取配置信息
 */
public class UseProperties {

    public static void main(String[] args) {
        // 获取 Properties
        Properties properties = new Properties();
        try {
            // 加载配置文件
            properties.load(new FileReader("src\\mysql.properties"));
            // 显示在打印流
            properties.list(System.out);
            // 设置键值对 返回设置的值
            Object email = properties.setProperty("email", "zichen1016@qq.com");
            // 根据key获取对应的值
            String username = properties.getProperty("username");
            String email1 = properties.getProperty("email");
            System.out.printf("%s\n%s\n", username, email1);
            // 把Properties修改后的信息存为文件 参数2为首航注释
            properties.store(new FileWriter("src\\mysql2.properties"),
                    "add email");
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
