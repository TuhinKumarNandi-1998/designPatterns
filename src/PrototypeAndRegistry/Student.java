package PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    private String name;
    private long rollNo;
    private String batch;

    public Student(String name, long rollNo, String batch) {
        this.name = name;
        this.rollNo = rollNo;
        this.batch = batch;
    }

    public Student(Student student) {
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.batch = student.batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
