public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private double monthSalary;
    private int ID;
    static int IDnumber;

    public Employee(){

    }

    public Employee(String firstname, String lastname, int age, double monthSalary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.monthSalary = monthSalary;
        IDnumber ++;
        ID = IDnumber;
    }

    public int getId() {
        return ID;
    }

    public String getFirstName() {
        return firstname ;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getMonthSalary(){
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary){
        this.monthSalary = monthSalary;
    }



}
