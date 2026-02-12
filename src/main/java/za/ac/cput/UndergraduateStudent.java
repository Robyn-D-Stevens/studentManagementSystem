package za.ac.cput;

public class UndergraduateStudent extends Student {
    private int creditHours;
    private double scholarshipAmount;

    @Override
    public double calculateTuition() {
        return creditHours * 500 - scholarshipAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: " + scholarshipAmount);
    }

    // Builder class will go here
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }

    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

}

