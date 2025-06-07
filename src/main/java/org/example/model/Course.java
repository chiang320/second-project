package org.example.model;

public class Course {
    private String courseId;
    private String courseName;
    private String description;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public Course(int courseId, String description, String courseName) {
        this.courseId = String.valueOf(courseId);
        this.description = description;
        this.courseName = courseName;


    }
}
