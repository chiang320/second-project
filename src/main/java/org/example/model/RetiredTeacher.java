package org.example.model;

public class RetiredTeacher extends Teacher {
    private static Course[] courses;
    private static final Course[] Course = courses;
    //unique fields
    private boolean isRetired;

    public RetiredTeacher(String name, int age, String email, String teacherId, String department, String[] courses, boolean isRetired) {
        super(name, age, email, teacherId, department, Course, 50, 20);
        this.isRetired = isRetired;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}
