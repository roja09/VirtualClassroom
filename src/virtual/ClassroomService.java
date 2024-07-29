package virtual;

public interface ClassroomService {
    void addClassroom(String name);
    void addStudent(String id, String className);
    void scheduleAssignment(String className, String assignmentId, String details);
    void submitAssignment(String studentId, String className, String assignmentId, String details);
}
