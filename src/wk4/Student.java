package wk4;

public class Student {

    public String name;
    public int age;
    public double gpa;
    final String dob;

    public Student(){
        dob = "Jan 1";
    }
    public Student(String dob){
        this.dob = dob;
    }
    public Student(String name, String dob,int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.dob = dob;
    }
    public static Student MatureStudent(String name, int age){

        Student s = new Student();
        s.name = name;
        s.age = age >= 30 ? age : 35;
        s.age = Math.max(30, age);
//        s.age = age >=30 && age <=40
//                ? age
//                : age >40 && age <= 50 ? age / 2 : 0 ; //tenary operators
        /*
        if(age >= 30)
            s.age = age
        else
            s.age = 35
         */
        return s;
    }

}
