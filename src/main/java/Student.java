import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double result = 0;
        for (int grade: this.grades) {
            result += grade;
        }
        return result / this.grades.size();
    }
}
