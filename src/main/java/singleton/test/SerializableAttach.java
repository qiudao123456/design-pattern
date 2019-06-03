package singleton.test;

import singleton.Eager;

import java.io.*;

/**
 * 序列化攻击
 *
 * @author qiudao
 */
public class SerializableAttach {
    public static void main(String[] args) throws Exception {
        Eager eager = Eager.getInstance();
        // 把对象序列化写进文件中
        File file = new File("D:/object");
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream oopt = new ObjectOutputStream(outputStream);
        oopt.writeObject(eager);
        //从文件中把对象反序列化读出来
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Eager eager1 = (Eager) objectInputStream.readObject();
        // 比较
        System.out.println("序列化攻击后是否相等："+(eager == eager1));//false
    }
}
