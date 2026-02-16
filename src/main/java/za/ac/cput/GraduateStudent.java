package za.ac.cput;

/**
 * Represents a Graduate Student, extending the base Student class.
 * Graduate students have additional properties such as research assistant status and stipend.
 * This class implements the Builder pattern for flexible object construction.
 */
public class GraduateStudent extends Student {
    // Indicates whether the student is a research assistant
    private boolean researchAssistant;
    // The monetary stipend provided to the graduate student
    private double stipend;

    /**
     * Calculates the tuition for a graduate student.
     * If the student is a research assistant, their stipend reduces the base tuition.
     * 
     * @return the calculated tuition amount (base tuition minus stipend if applicable)
     */
    @Override
    public double calculateTuition() {
        // Logic: stipend reduces tuition if research assistant
        double baseTuition = 64000; // assumed tuition
        if (researchAssistant) {
            return baseTuition - stipend;
        }
        return baseTuition;
    }

    /**
     * Returns the student type identifier for this class.
     * 
     * @return the string "Graduate" identifying this as a graduate student
     */
    @Override
    public String getStudentType() {
        return "Graduate";
    }

    /**
     * Displays detailed information about the graduate student.
     * This method calls the parent class method and then prints graduate-specific details.
     */
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);
    }

    // -------- Builder Pattern --------
    /**
     * Builder class for constructing GraduateStudent instances using the Builder pattern.
     * This allows for flexible and readable object creation with optional fields.
     */
    public static class Builder {
        // Required fields
        private String studentId;
        private String name;
        // Optional fields
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        /**
         * Constructs a Builder with the required fields: studentId and name.
         * 
         * @param studentId the unique identifier for the student
         * @param name the name of the student
         */
        // Required fields in constructor
        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        /**
         * Sets the email for the student being built.
         * 
         * @param email the student's email address
         * @return the Builder instance for method chaining
         */
        // Optional fields with chainable methods
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the department for the student being built.
         * 
         * @param department the student's department
         * @return the Builder instance for method chaining
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }

        /**
         * Sets the research assistant status for the student being built.
         * 
         * @param researchAssistant true if the student is a research assistant, false otherwise
         * @return the Builder instance for method chaining
         */
        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        /**
         * Sets the stipend amount for the student being built.
         * 
         * @param stipend the monetary stipend amount
         * @return the Builder instance for method chaining
         */
        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        /**
         * Constructs and returns a GraduateStudent instance with all the configured properties.
         * 
         * @return a new GraduateStudent object initialized with the builder's values
         */
        // Final build method
        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }

    /**
     * Private constructor that initializes a GraduateStudent using a Builder instance.
     * This ensures that GraduateStudent objects can only be created through the Builder pattern.
     * 
     * @param builder the Builder instance containing all student properties
     */
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
