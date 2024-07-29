Virtual Classroom Manager
Overview
The Virtual Classroom Manager is a terminal-based application designed to manage virtual classrooms, students, and assignments. It allows for class scheduling, student attendance, and assignment submissions. This project employs various design patterns to ensure an efficient, flexible, and maintainable codebase.

Problem Statement
Develop a backend system for an EdTech platform that can:

Add Classrooms: Create new virtual classrooms.
Add Students: Enroll students into specific classrooms.
Schedule Assignments: Add assignments to a classroom.
Submit Assignments: Mark assignments as submitted by students.

User Input
Add Classroom: add_classroom [class_name]
Add Student: add_student [student_id] [class_name]
Schedule Assignment: schedule_assignment [class_name] [assignment_details]
Submit Assignment: submit_assignment [student_id] [class_name] [assignment_id] [submission_details]

Console Output
Classroom Addition: "Classroom [Name] has been created."
Student Addition: "Student [ID] has been enrolled in [Class Name]."
Assignment Scheduled: "Assignment for [Class Name] has been scheduled."
Assignment Submission: "Assignment submitted by Student [ID] in [Class Name]."

Code Organization

Classes

1)Virtual
Role: Entry point and command handler.
Functionality: Handles user input and interacts with the ClassroomService.

2)VirtualClassroomManager
Role: Singleton class managing the application instance.
Functionality: Provides a global point of access to the ClassroomService.

3)ClassroomService
Role: Interface defining methods for classroom management.
Methods: addClassroom, addStudent, scheduleAssignment, submitAssignment.

4)ClassroomServiceImpl
Role: Implements ClassroomService to handle classroom operations.
Functionality: Manages adding classrooms, students, and assignments, and handles assignment submissions.

5)Classroom
Role: Represents a classroom, students, and assignments.
Functionality: Manages lists of students and assignments.

6)Assignment
Role: Represents an assignment and tracks submissions.
Functionality: Stores assignment details and tracks student submissions.

7)Student
Role: Represents a student.
Functionality: Holds student ID.

8)StudentSubmission
Role: Represents a student's assignment submission.
Functionality: Stores student and submission details.


The Virtual Classroom Manager utilizes key design patterns to efficiently manage virtual classrooms, students, and assignments. The Singleton pattern provides a centralized management instance, while the Factory Method and Observer patterns enhance flexibility and maintainability. The code is organized into modular components, adhering to best practices for readability and scalability
