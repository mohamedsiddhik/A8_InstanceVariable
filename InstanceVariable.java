//Instance Variable

public  class InstanceVariable
{
    public String name;
    private  double salary;

    public  InstanceVariable(String empName)
    {
        name = empName;
    }

    public  void setSalary(double empSal)
    {
        salary = empSal;
    }

    public  void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }


    public static void main(String[] args) {
        InstanceVariable iv1 = new InstanceVariable("mohamed");
        iv1.setSalary(3000);
        System.out.println("Salary : " + iv1.salary);
        iv1.display();
    }
}
