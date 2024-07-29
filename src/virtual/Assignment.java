package virtual;

import java.util.*;

public class Assignment {
    private String id;
    private String details;
    private List<StudentSubmission> submissions;

    public Assignment(String id, String details) {
        this.id = id;
        this.details = details;
        this.submissions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public void submit(Student student, String submissionDetails) {
        submissions.add(new StudentSubmission(student, submissionDetails));
    }
}
