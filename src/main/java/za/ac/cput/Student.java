package za.ac.cput;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;
    public abstract double calculateTuition();
    public abstract String getStudentType();
    public void displayStudentDetails(){};
}
