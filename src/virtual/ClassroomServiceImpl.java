package virtual;

import java.util.*;

public class ClassroomServiceImpl implements ClassroomService {
    private Map<String, Classroom> classrooms;
    private Map<String, Student> students;

    public ClassroomServiceImpl() {
        this.classrooms = new HashMap<>();
        this.students = new HashMap<>();
    }

    @Override
    public void addClassroom(String name) {
        if (!classrooms.containsKey(name)) {
            classrooms.put(name, new Classroom(name));
            System.out.println("Classroom " + name + " has been created.");
        } else {
            System.out.println("Classroom " + name + " already exists.");
        }
    }

    @Override
    public void addStudent(String id, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Student student = new Student(id);
            students.put(id, student);
            classroom.addStudent(student);
            System.out.println("Student " + id + " has been enrolled in " + className + ".");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    @Override
    public void scheduleAssignment(String className, String assignmentId, String details) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Assignment assignment = new Assignment(assignmentId, details);
            classroom.addAssignment(assignment);
            System.out.println("Assignment " + assignmentId + " for " + className + " has been scheduled.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    @Override
    public void submitAssignment(String studentId, String className, String assignmentId, String details) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Student student = students.get(studentId);
            if (student != null && classroom.getStudents().contains(student)) {
                Assignment assignment = classroom.getAssignmentById(assignmentId);
                if (assignment != null) {
                    assignment.submit(student, details);
                    System.out.println("Assignment " + assignmentId + " submitted by Student " + studentId + " in " + className + ".");
                } else {
                    System.out.println("Assignment " + assignmentId + " does not exist in " + className + ".");
                }
            } else {
                System.out.println("Student " + studentId + " is not enrolled in " + className + ".");
            }
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }
}
