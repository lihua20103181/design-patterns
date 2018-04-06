package cn.keking.design.behavior.memento;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 原发人
 */
public class Originator {
    private long pos;
    private RandomAccessFile in;
    private String path;

    public Originator() {
        path = this.getClass().getResource("/").getPath();
        path += "readme.txt";
        try {
            in = new RandomAccessFile(path,"rw");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public String getNextLine() {
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
    /**
     * 获取断点位置
     * @return
     */
    public void restoreFromMemento(Memento memento){
        pos = memento.getPos();
        try {
            in.seek(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 保存断点位置
     */
    public Memento createMemento() {
        try {
            pos = in.getFilePointer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Memento memento = new Memento();
        memento.setPos((int) pos);
        return memento;
    }
    public void close(){
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
