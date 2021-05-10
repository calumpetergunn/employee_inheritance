package staff;

import java.util.Objects;

public abstract class Employee {

    private String name;
    private int NINumber;
    protected double salary;

    public Employee(String name, int NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String newName) {
        if (newName == null || newName.equals("") ){
           return;
        }
        this.name = newName;
    }

    public void raiseSalary(double raise){
        if(raise > 0) {
            this.salary = salary + (salary * raise);
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
