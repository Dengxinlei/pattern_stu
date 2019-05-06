package com.gupaoedu.dengxinlei.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class ClassTeacher {
    Map<String, Teacher> teacherRegistry = new HashMap<String, Teacher>();
    {
        teacherRegistry.put("数学", new MathTeacher());
        teacherRegistry.put("英语", new EnglishTeacher());
    }
    public void doTeach(String course) {
        teacherRegistry.get(course).teach();
    }
}
