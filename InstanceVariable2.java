

public  class InstanceVariable2
{

    public  String name ;
    String div;
    private  int age;

    public InstanceVariable2(String sname)
    {
        name = sname;
    }
    public  void  setDiv(String sdiv){ div = sdiv;}

    public void setAge(int sage){ age = sage;}
    public  void  display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Div : " + div);
        System.out.println("Student Age : " + age);
    }

    public static void main(String[] args) {
        InstanceVariable2 stud = new InstanceVariable2("Mohamed");
        stud.setAge(17);
        stud.setDiv("C");
        stud.display();
    }
}