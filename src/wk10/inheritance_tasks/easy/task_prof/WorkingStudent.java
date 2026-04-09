package wk10.inheritance_tasks.easy.task_prof;

public class WorkingStudent extends Student{

    String job;

    public WorkingStudent(){}

    //alt+insert


    public WorkingStudent(int studentID, String name, int age, String job) {
        super(studentID, name, age);
        this.job = job;
    }
    @Override
    public String greet(){
        return super.greet() + " and my job is " + job;
    }
}
