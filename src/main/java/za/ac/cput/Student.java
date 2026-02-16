package za.ac.cput;

// Base class from sample code
public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;
    public abstract double calculateTuition();
    public abstract String getStudentType();
    public void displayStudentDetails(){};
}
