public class Employee {private String firstname;
    private String lastname;
    private int age;
    private int ID;
    static int IDnumber;
    private double monthSalary;

    public Employee(){

    }

    public Employee(String firstname,String lastname,int age, double monthSalary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.monthSalary = monthSalary;
        IDnumber ++;
        ID = IDnumber;
    }






}
