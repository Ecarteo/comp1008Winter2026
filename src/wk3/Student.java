package wk3;

public class Student {
    private int studentId;
    private String name;
    private double grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >= 0 && grade <= 100)
            this.grade = grade;
    }

    public Student(int studentId, String name, double grade) {
        setStudentId(studentId);
        setName(name);
        setGrade(grade);
    }
}
