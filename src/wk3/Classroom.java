package wk3;

public class Classroom {

    private char[] roomNumber = new char[5];
    private int maxNumStudents;
    private Student[] students;
    private int indexTracker;

    private void setMaxNumStudents(int maxNumStudents) {
        this.maxNumStudents = maxNumStudents;
    }
    private void setRoomNumber(String roomNumber) {
        if(roomNumber.length() <= 5)
            this.roomNumber = roomNumber.toCharArray();
    }
    public int getMaxNumStudents() {
        return maxNumStudents;
    }
    public String getRoomNumber() {
        return new String(roomNumber);
    }
    public Classroom(String roomNumber, int maxNumStudents) {
        setRoomNumber(roomNumber);
        setMaxNumStudents(maxNumStudents);
        this.students = new Student[maxNumStudents];
    }
    public void addStudent(Student student) {
        if(indexTracker >= students.length)
            return;
        students[indexTracker++] = student;

    }
    public double getClassAverage(){

        double sum = 0;

        for(int i = 0; i < indexTracker; i++){
            sum += students[i].getGrade();
        }
        return sum / indexTracker;
    }
}
