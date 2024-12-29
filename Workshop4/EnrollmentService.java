package Workshop4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {
    private Map<String, Set<String>> studentEnrollments = new HashMap<>();

    public boolean enrollStudent(String studentUsername, String courseName) {
        Set<String> enrolledCourses = studentEnrollments.getOrDefault(studentUsername, new HashSet<>());
        
        if (enrolledCourses.contains(courseName)) {
            return false;
        }
        
        enrolledCourses.add(courseName);
        studentEnrollments.put(studentUsername, enrolledCourses);
        return true; 
    }

    public static void main(String[] args) {
        EnrollmentService service = new EnrollmentService();
        System.out.println(service.enrollStudent("johnDoe", "Math 101")); // true
        System.out.println(service.enrollStudent("johnDoe", "Math 101")); // false
    }
}
