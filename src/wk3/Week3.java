package wk3;

public class Week3 {

    public static void main(String[] args) {
//        EventTicketingSystem ts = new EventTicketingSystem("Lemonade Stand", 5, 200);
//        ts.buyTickets(5);
//        ts.refundTickets(2);
//        ts.buyTickets(20);
//        System.out.println(ts.getRevenueGenerated());

//        Course comp1008 = new Course("Intro to OOP", "comp1008", 6);
//        comp1008.addEvaluation("Assignment 1", 90);
//        comp1008.addEvaluation("Assignment 2", 80);
//        Object[] values = comp1008.getEvaluation(0);
//
//        for(Object o : values) {
//            System.out.println(o);
//        }

        Classroom classroom = new Classroom("K320", 20);
        classroom.addStudent(new Student(12345, "John Smith", 90));
        classroom.addStudent(new Student(98765, "Mary Johnson", 100));
        System.out.println(classroom.getClassAverage());

        Course c = new Course("Intro to OOP", "comp1008", 6);
        c.values[0] = true;
        c.values[1] = false;

    }
}
