public class EmployeeTest{
    public static void main(String[] args){
        Employee employee1 = new Employee("Gabriel", "Torres", 3500);
        Employee employee2 = new Employee("Fulano", "Da Silva", 4000);

        System.out.printf(employee1 + " | Salário anual: R$%.2f\n", employee1.getSalary()*12);
        System.out.printf(employee2 + " | Salário anual: R$%.2f\n", employee2.getSalary()*12);

        employee1.setSalary(3500*1.10); 
        employee2.setSalary(4000*1.10);


        System.out.printf(employee1 + " | Salário anual: R$%.2f\n", employee1.getSalary()*12);
        System.out.printf(employee2 + " | Salário anual: R$%.2f\n", employee2.getSalary()*12);
    }
}