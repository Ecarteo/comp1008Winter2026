package wk4;

public class Week4 {
    public static void main(String[] args) {

        BarrieGoTrain train = new BarrieGoTrain();
        //train.station = "Ben Station";

        train.chosenStation = BarrieGoTrain.Station.UNION;

        Student s = new Student();

        //Student m = s.MatureStudent("Hi", 40);

        Student m = Student.MatureStudent("Hi", 40);
        Student m1 = new Student("dec 1");
        Student m2 = new Student("Joe","dec 2", 20, 3.5);

    }
}
