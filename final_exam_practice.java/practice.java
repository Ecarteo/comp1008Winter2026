package final_exam_practice.java;

public class practice {
    
}

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();
}

interface BonusEligible {
    void calculateBonus();
}

class Developer extends Employee implements BonusEligible {
    Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + "'s bonus: $5000");
    }
}

class Manager extends Employee implements BonusEligible {
    Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + "'s bonus: $8000");
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice");
        Employee mgr = new Manager("Bob");

        dev.work();
        ((BonusEligible) dev).calculateBonus();

        mgr.work();
        ((BonusEligible) mgr).calculateBonus();
    }
}