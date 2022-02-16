import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 */
public class CreateAFile {

    public static void main(String[] args) {
        // 1
        File file = new File("d:\\a.txt");
        try {
            boolean result = file.createNewFile();
            System.out.println(result ? "创建成功！" : "创建失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2
        File parentFile = new File("d:\\");
        String fileName = "b.txt";
        file = new File(parentFile, fileName);
        try {
            boolean result = file.createNewFile();
            System.out.println(result ? "创建成功！" : "创建失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3
        String parentPath = "d:\\";
        fileName = "c.txt";
        file = new File(parentPath, fileName);
        try {
            boolean result = file.createNewFile();
            System.out.println(result ? "创建成功！" : "创建失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}