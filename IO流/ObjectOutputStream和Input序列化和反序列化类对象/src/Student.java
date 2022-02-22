import java.io.Serializable;

/**
 * 需要序列化对象，要实现Serializable
 */
public class Student implements Serializable {

    // 序列化版本号，提高兼容性。新增变量后会认为是一个新的版本
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    // static 和 transient 修饰的成员变量不会序列化
    private static Integer age;
    private transient String email;

    public Student() {
    }

    public Student(Integer id, String name,Integer age, String email) {
        this.id = id;
        this.name = name;
        Student.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
