import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class grades {
    public static void main(String[] args) {
        Map<String, Double> studentGpaMap = new HashMap<>();

        studentGpaMap.put("Mahsun Alkhasov", 2.6);
        studentGpaMap.put("Donald Trump", 3.5);
        studentGpaMap.put("Brad Pitt", 3.9);
        studentGpaMap.put("Angelina Jolie", 3.7);
        studentGpaMap.put("Megan Fox", 3.5);

        double maxGpa = -1.0;
        for (double gpa : studentGpaMap.values()) {
            if (gpa > maxGpa) {
                maxGpa = gpa;
            }
        }

        List<String> topStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGpaMap.entrySet()) {
            if (entry.getValue() == maxGpa) {
                topStudents.add(entry.getKey());
            }
        }

        System.out.println("Student(s) with highest GPA (" + maxGpa + "): " + topStudents);

        double sum = 0.0;
        for (double gpa : studentGpaMap.values()) {
            sum += gpa;
        }
        double averageGpa = sum / studentGpaMap.size();
        System.out.println("Average GPA: " + averageGpa);

        int countBelowAverage = 0;
        for (double gpa : studentGpaMap.values()) {
            if (gpa < averageGpa) {
                countBelowAverage++;
            }
        }
        System.out.println("Number of students with GPA less than average: " + countBelowAverage);
    }
}