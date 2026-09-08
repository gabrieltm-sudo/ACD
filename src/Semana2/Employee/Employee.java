public class Employee {
    private String firstName;
    private String surName;
    private double salary;

    public Employee(String firstName, String surName, double salary){
        this.firstName = firstName;
        this.surName = surName;

        if(salary<0){
            salary = 0;
        }
        this.salary = salary;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getSurName(){
        return surName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return String.format("%s %s | Salário mensal: R$%.2f", firstName, surName, salary);
    }
}
