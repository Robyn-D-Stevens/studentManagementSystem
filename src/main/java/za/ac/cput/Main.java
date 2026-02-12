package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Build an Undergraduate Student
        UndergraduateStudent uStudent = new UndergraduateStudent.Builder("987654321", "Robyn")
                .email("robyn@email.com")
                .department("ICT")
                .creditHours(20)
                .scholarshipAmount(20000)
                .build();

        uStudent.displayStudentDetails();
        System.out.println("Tuition: " + uStudent.calculateTuition());
        System.out.println("----------------------------------------");

        // Build a Graduate Student
        GraduateStudent gStudent = new GraduateStudent.Builder("20123456", "Alex")
                .email("alex@university.com")
                .department("Information Technology")
                .stipend(8000)
                .build();

        gStudent.displayStudentDetails();
        System.out.println("Tuition: " + gStudent.calculateTuition());
    }
}