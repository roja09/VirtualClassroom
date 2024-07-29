package virtual;

import java.util.Scanner;

public class Virtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();
        ClassroomService classroomService = manager.getClassroomService();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Classroom");
            System.out.println("2. Add Student");
            System.out.println("3. Schedule Assignment");
            System.out.println("4. Submit Assignment");
            System.out.println("5. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter classroom name:");
                    String className = scanner.nextLine();
                    classroomService.addClassroom(className);
                    break;

                case "2":
                    System.out.println("Enter student ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter classroom name:");
                    className = scanner.nextLine();
                    classroomService.addStudent(studentId, className);
                    break;

                case "3":
                    System.out.println("Enter classroom name:");
                    className = scanner.nextLine();
                    System.out.println("Enter assignment ID:");
                    String assignmentId = scanner.nextLine();
                    System.out.println("Enter assignment details:");
                    String assignmentDetails = scanner.nextLine();
                    classroomService.scheduleAssignment(className, assignmentId, assignmentDetails);
                    break;

                case "4":
                    System.out.println("Enter student ID:");
                    studentId = scanner.nextLine();
                    System.out.println("Enter classroom name:");
                    className = scanner.nextLine();
                    System.out.println("Enter assignment ID:");
                    assignmentId = scanner.nextLine();
                    System.out.println("Enter assignment submission details:");
                    String submissionDetails = scanner.nextLine();
                    classroomService.submitAssignment(studentId, className, assignmentId, submissionDetails);
                    break;

                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unknown option. Please try again.");
            }
        }
    }
}
