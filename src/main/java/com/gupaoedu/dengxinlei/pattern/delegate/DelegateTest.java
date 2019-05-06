package com.gupaoedu.dengxinlei.pattern.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        GuideMaster guideMaster = new GuideMaster();
        guideMaster.command("数学", new ClassTeacher());
        guideMaster.command("英语", new ClassTeacher());
    }
}
