package com.epam.learn.edu.entity;

import java.util.Comparator;

public enum StudentComparator implements Comparator<Student> {
    NAME {
        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    }, AVERAGE_MARK {
        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    };


}
