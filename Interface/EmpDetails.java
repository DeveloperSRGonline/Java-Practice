interface Salary {

    double Basic_Salary = 10000.0;

    void Basic_Sal();
}

class Employee {

    String Name;
    int age;

    Employee(String n, int b) {
        Name = n;
        age = b;
    }

    void display() {
        System.out.println("Name of Employee : " + Name);
        System.out.println("Age of Employee : " + age);
    }
}

class Gross_Salary extends Employee implements Salary
{
    double HRA,TA,DA;

    Gross_Salary(String n,int b,double h,double t,double d){
        super(n,b);
        HRA = h;
        TA = t;
        DA = d;
    }

    public void Basic_Sal()
    {
        System.out.println("Basic Salary : " + Basic_Salary);
    }

    void Total_Sal()
    {
        display();
        Basic_Sal();
        double Total_Sal = Basic_Salary + TA + DA + HRA;
        System.out.println("Total Salary : " + Total_Sal);
    }
}

public class EmpDetails
{
    public static void main(String[] args) {
        Gross_Salary s = new Gross_Salary("Shivam",20,1000,2000,7000);
        s.Total_Sal();
    }
}