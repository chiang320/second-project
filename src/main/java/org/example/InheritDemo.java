package org.example;

import net.datafaker.Faker;
import org.example.model.Course;
import org.example.model.RetiredTeacher;
import org.example.model.Student;
import org.example.model.Teacher;

public class InheritDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Teacher teacher = new Teacher(
                faker.name().fullName(),
                faker.number().numberBetween(25, 30),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new Course[]{
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                        new Course(faker.number().positive(), faker.educator().course(), "default"),
                },
                2000,
                100
        );

        Student student = new Student(
                faker.name().fullName(),
                faker.number().numberBetween(18, 22),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().course(),
                faker.gender().shortBinaryTypes()
        );
        teacher.teach();
        teacher.displayInfo();
        teacher.eat();
        student.displayInfo();
        student.eat();

        RetiredTeacher retiredTeacher = new RetiredTeacher(faker.name().fullName(),
                faker.number().numberBetween(25, 30),
                faker.internet().emailAddress(),
                faker.number().digit(),
                faker.educator().campus(),
                new String[]{
                        faker.educator().course(),
                        faker.educator().course(),
                        faker.educator().course()
                },
                true
        );
//7. 打印 retiredTeacher的 isRetired屬性
        System.out.println("該位老師是否退休:" + retiredTeacher.isRetired());
        //8. teacher invoke(call) functions
        teacher.processPayment();
        //9. 打印 teacher的 getPaymentDetail方法
        System.out.println(teacher.getPaymentDetail());
        teacher.sendNotifcation("測試訊息");

    }
}
