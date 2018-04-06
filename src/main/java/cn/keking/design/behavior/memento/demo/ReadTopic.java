package cn.keking.design.behavior.memento.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 原始 文件断点读取
 */
public class ReadTopic {
    private long pos;
    RandomAccessFile in;

    public ReadTopic() {
        pos = this.getRestorePos();
        String path = this.getClass().getResource("/").getPath();
        path += "readme.txt";
        try {
            in = new RandomAccessFile(path,"rw");
            // 定位文件游标
            in.seek(pos);
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
    private long getRestorePos(){
        long value = 0 ;
        String path = this.getClass().getResource("/").getPath();
        path += "memento.txt";
        System.out.println(path);
        RandomAccessFile in2 = null;
        try {
            in2 = new RandomAccessFile(path,"rw");
            value = in2.readInt();
        } catch (Exception e) {
            value = 0;
            e.printStackTrace();
        } finally {
            try {
                in2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    /**
     * 保存断点位置
     */
    private void saveRestorePos() {
        String path = this.getClass().getResource("/").getPath();
        path += "memento.txt";
        try {
            RandomAccessFile out = new RandomAccessFile(path,"rw");
            pos = in.getFilePointer();
            out.writeInt((int) pos);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(){
        this.saveRestorePos();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
