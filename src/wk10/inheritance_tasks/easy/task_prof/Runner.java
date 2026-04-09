package wk10.inheritance_tasks.easy.task_prof;

public class Runner {

    public static void main(String[] args) {

        Student s = new Student(123, "john", 20);
        WorkingStudent ws = new WorkingStudent(456, "Mary", 21 , "worker");


        System.out.println(s.greet());
        System.out.println(ws.greet());

    }
}
