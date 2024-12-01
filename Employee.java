public class Employee extends Person1{
    Employee(int age, String name) {
        super(age, name);
    }

    int employid;
    double salary;

//method to pass employid and salary
    void displaydetails(int employid,double salary)
    {
        this.employid=employid;
        this.salary=salary;
        System.out.println("Name of the person "+super.name);
        System.out.println("Age of the person "+super.age);
        System.out.println("Employeeid of the person "+this.employid);
        System.out.println("Salary of the person "+this.salary);
    }

public static void main(String[] args){
        Employee employee=new Employee(29,"Bala Jyothi");
        employee.displaydetails(10001,40000);
}

}