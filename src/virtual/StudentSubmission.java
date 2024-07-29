package virtual;

public class StudentSubmission {
    private Student student;
    private String submissionDetails;

    public StudentSubmission(Student student, String submissionDetails) {
        this.student = student;
        this.submissionDetails = submissionDetails;
    }

    public Student getStudent() {
        return student;
    }

    public String getSubmissionDetails() {
        return submissionDetails;
    }
}
