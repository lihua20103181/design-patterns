package cn.keking.design.behavior.memento;

import java.io.*;

/**
 * 备忘录管理类
 */
public class Caretaker {
    File file;
    String strPath;

    public Caretaker() {
        strPath  = this.getClass().getResource("/").getPath();
        file = new File(strPath.concat("memento.txt"));
    }

    /**
     * 读取备忘录文件并恢复备忘录对象
     * @return
     */
    public Memento getMemento() {
        Memento memento = new Memento();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(in);
            memento = (Memento) oin.readObject();
            oin.close();;
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memento;
    }

    /**
     * 将备忘录对象保存在文件中
     * @param memento
     */
    public void saveMemento(Memento memento) {
        try {
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(memento);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
