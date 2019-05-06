package com.gupaoedu.dengxinlei.pattern.delegate;

public class GuideMaster {
    public void command(String course, ClassTeacher classTeacher) {
        classTeacher.doTeach(course);
    }
}
