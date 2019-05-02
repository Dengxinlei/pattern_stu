package com.gupaoedu.dengxinlei.pattern.prototype.deep;

import java.io.*;
import java.util.List;

public class Children implements Cloneable, Serializable {
    private String name;
    private int age;
    private int gendar;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGendar() {
        return gendar;
    }

    public void setGendar(int gendar) {
        this.gendar = gendar;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    // 通过序列化和反序列化对对象进行深克隆
    private Object deepClone() {
        try {
            // 将对象读取到字节数组流中  在内存中完成操作，直接操作字节码
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return null;
    }

    @Override
    public String toString() {
        return "Children{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gendar=" + gendar +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
//        return super.clone();
    }
}
