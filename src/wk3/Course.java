package wk3;

public class Course {
    public boolean[] values = new boolean[5];
    private String courseName;
    private String courseCode;
    private String[] evaluations;
    private double[] grades;
    private int numberOfEvaluations;
    private int indexTracker;

    public Course(String courseName, String courseCode, int numberOfEvaluations) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.numberOfEvaluations = numberOfEvaluations;

        this.evaluations = new String[numberOfEvaluations];
        this.grades = new double[numberOfEvaluations];
    }

    public void addEvaluation(String evaluation, double grade) {

        if(indexTracker >= numberOfEvaluations) {
            return;  //reached our max amount of evaluations
        }

        this.evaluations[indexTracker] = evaluation;
        this.grades[indexTracker] = grade;
        indexTracker++;
    }
    public Object[] getEvaluation(int index){
        if(index >=0 && index < numberOfEvaluations)
            return new Object[]{this.evaluations[index], this.grades[index]};
        return null;
    }
}
