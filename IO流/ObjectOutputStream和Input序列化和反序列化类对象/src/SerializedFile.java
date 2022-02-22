import java.io.*;

/**
 * ObjectOutputStream序列化类对象
 */
public class SerializedFile {

    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream = null;
        try {
            // 存放序列化后的文件 节点流
            FileOutputStream fileOutputStream = new FileOutputStream("src\\data.data");
            // 创建对象输出处理流
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // 序列化包装类型，包装类型实现了Serializable接口，int会装箱成包装类型
            objectOutputStream.writeInt(3);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeChar('A');
            objectOutputStream.writeDouble(3.1d);
            objectOutputStream.writeUTF("你好");
            // 序列化对象的信息
            Student zhangsan = new Student(1, "zhangsan", 23, "zichen1016@qq.com");
            objectOutputStream.writeObject(zhangsan);
            System.out.println("ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
