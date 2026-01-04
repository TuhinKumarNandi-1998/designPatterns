package PrototypeAndRegistry;

public class PrototypeAndRegistryClient {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.fillRegistry();

        Student student = studentRegistry.getStudent("nov25");
        student.setName("Riju");
        student.setRollNo(4);

        System.out.println(student.getBatch() + "|" + student.getName() + "|" + student.getRollNo());
    }
}
