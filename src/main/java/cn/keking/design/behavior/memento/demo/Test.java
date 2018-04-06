package cn.keking.design.behavior.memento.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String strMark = "";
        ReadTopic readTopic = new ReadTopic();
        Scanner scanner = new Scanner(System.in);
        do {
            String line = readTopic.getNextLine();
            System.out.println(line);
            System.out.println("if continus,press 'Y'");
            strMark = scanner.nextLine();
        } while (strMark.equalsIgnoreCase("Y"));

        readTopic.close();;
    }
}
