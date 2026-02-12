package za.ac.cput;

public class GraduateStudent extends Student {
    private boolean researchAssistant;
    private double stipend;

    @Override
    public double calculateTuition() {
        // Logic: stipend reduces tuition if research assistant
        double baseTuition = 64000; // assumed tuition
        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);
    }

    // -------- Builder Pattern --------
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        // Required fields in constructor
        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        // Optional fields with chainable methods
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        // Final build method
        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }

    // Private constructor that takes Builder
    private GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }
}

