package za.ac.cput;

/**
 * UndergraduateStudent represents an undergraduate student in the system.
 * This class extends the Student base class and adds undergraduate-specific
 * properties such as credit hours and scholarship amounts.
 * 
 * The class uses the Builder pattern for object construction to ensure
 * flexible and readable instantiation.
 */
public class UndergraduateStudent extends Student {
    // Number of credit hours completed or enrolled in by the student
    private int creditHours;
    
    // Scholarship amount awarded to the student (reduces tuition cost)
    private double scholarshipAmount;

    /**
     * Calculates the tuition for an undergraduate student.
     * Formula: (credit hours × $500 per credit hour) - scholarship amount
     * 
     * @return the calculated tuition amount (may be negative if scholarship exceeds cost)
     */
    @Override
    public double calculateTuition() {
        return creditHours * 500 - scholarshipAmount;
    }

    /**
     * Returns the student type as a string identifier.
     * 
     * @return "Undergraduate"
     */
    @Override
    public String getStudentType() {
        return "Undergraduate";
    }

    /**
     * Displays all undergraduate student details including base student information
     * and undergraduate-specific fields (credit hours and scholarship amount).
     */
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: " + scholarshipAmount);
    }

    /**
     * Builder class for creating UndergraduateStudent instances using the Builder pattern.
     * This allows for flexible and readable construction with optional parameters.
     * 
     * Usage example:
     * UndergraduateStudent student = new UndergraduateStudent.Builder("STU001", "John Doe")
     *     .email("john@university.edu")
     *     .department("Computer Science")
     *     .creditHours(12)
     *     .scholarshipAmount(5000.0)
     *     .build();
     */
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        /**
         * Constructs a Builder with required parameters.
         * 
         * @param studentId the unique student identifier (required)
         * @param name the student's full name (required)
         */
        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        /**
         * Sets the student's email address.
         * 
         * @param email the email address
         * @return this Builder instance for method chaining
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the student's department.
         * 
         * @param department the department name
         * @return this Builder instance for method chaining
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }

        /**
         * Sets the number of credit hours.
         * 
         * @param creditHours the credit hours (typically 1-18 per semester)
         * @return this Builder instance for method chaining
         */
        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        /**
         * Sets the scholarship amount.
         * 
         * @param scholarshipAmount the scholarship amount in dollars
         * @return this Builder instance for method chaining
         */
        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        /**
         * Builds and returns a new UndergraduateStudent instance with the configured parameters.
         * 
         * @return a new UndergraduateStudent instance
         */
        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }

    /**
     * Private constructor used by the Builder pattern.
     * Initializes the UndergraduateStudent with values from the Builder.
     * 
     * @param builder the Builder instance containing the student data
     */
    private UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

}
