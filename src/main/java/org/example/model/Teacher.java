package org.example.model;

import java.util.List;

public class Teacher extends Person implements Payable, Notifiable {
    //unique field
    private String teacherId;
    private String department;
    private Course[] courses;
    private double hourlyRate;
    private int workedHours;

    public Teacher(String name, int age, String email, String teacherId, String department, Course[] courses, double hourlyRate, int workedHours) {
        super(name, age, email);
        this.teacherId = teacherId;
        this.department = department;
        this.courses = courses;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public void eat() {
        System.out.println("福利社吃便當");

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("教師編號:" + teacherId);
        System.out.println("部門名稱:" + department);
        System.out.println("授課內容:");
        for (Course course : courses) {
            System.out.printf("%s: %s, %s%n", course.getCourseId(), course.getCourseName(), course.getDescription());
        }
    }


    public void teach() {
        System.out.println(getName() + "正在教授" + courses[0] + "課程");
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * workedHours;
    }

    @Override
    public void processPayment() {
        System.out.println("處理" + getName() + "的薪資支付中" + calculatePayment());

    }

    @Override
    public String getPaymentDetail() {
        return String.format("教師:%s , 時薪為:%s , 工作時數:%s , 總薪資: %s",
                getName(),
                hourlyRate,
                workedHours,
                calculatePayment());
    }

    @Override
    public void sendNotification(String message) {
        System.out.printf("向%s,發送通知: %s 測試訊息 %s");
    }
}


