import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream反序列化类对象
 */
public class DeserializedFile {

    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            // 读取要反序列化的文件 节点流
            FileInputStream fileInputStream = new FileInputStream("src\\data.data");
            // 创建对象输入处理流
            objectInputStream = new ObjectInputStream(fileInputStream);
            // 反序列化的顺序要和序列化的顺序一致
            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readChar());
            System.out.println(objectInputStream.readDouble());
            System.out.println(objectInputStream.readUTF());
            System.out.println(objectInputStream.readObject());
            /**
             * Student类的成员变量age,email不参加序列化
             * 结果为
             * 3
             * true
             * A
             * 3.1
             * 你好
             * Student{id=1, name='zhangsan', age='null', email='null'}
             */
            System.out.println("ok~");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
