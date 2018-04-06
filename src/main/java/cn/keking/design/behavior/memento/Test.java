package cn.keking.design.behavior.memento;

import java.util.Scanner;

/**
 * 断点读取文件
 */
public class Test {
    public static void main(String[] args) {
        // 原发对象
        Originator originator = new Originator();
        // 备忘录
        Memento memento = new Memento();
        // 负责人
        Caretaker caretaker = new Caretaker();

        Scanner scanner = new Scanner(System.in);
        System.out.println("从断点开始:Y/N?");
        String strMark = scanner.nextLine();
        if (strMark.equalsIgnoreCase("Y")) {
            memento = caretaker.getMemento();
            originator.restoreFromMemento(memento);
        }
        do {
            String line = originator.getNextLine();
            System.out.println(line);
            System.out.println("if continus,press 'Y'");
            strMark = scanner.nextLine();
        } while (strMark.equalsIgnoreCase("Y"));
        memento = originator.createMemento();
        originator.close();
        caretaker.saveMemento(memento);
    }
}
