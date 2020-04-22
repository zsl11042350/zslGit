package com.neusoft.collection.teach;

import java.util.Comparator;

/**
 * @Author: wwb
 * @Date: 2020/4/17 15:01
 */
public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
