public class Employee {
    private String name;
    private int age;
    private int ID;
    static int IDnumber;
    private double monthSalary;

    public Employee(){

    }

    public Employee(String name,int age, double monthSalary){
        this.name = name;
        this.age = age;
        this.monthSalary = monthSalary;
        IDnumber ++;
        ID = IDnumber;
    }






}
