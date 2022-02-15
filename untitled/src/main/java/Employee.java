public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private double monthSalary;
    private int ID;
    static int IDnumber;

    public Employee(){

    }

    public Employee(String firstname){
        this(firstname,null);
    }

    public Employee(String firstname,String lastname) {
        this(firstname,lastname,0);
    }

    public Employee(String firstname,String lastname,int age){
        this(firstname,lastname,age,0);
    }

    public Employee(String firstname, String lastname, int age, double monthSalary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.monthSalary = monthSalary;
        IDnumber ++;
        ID = IDnumber;
    }

    public String getFirstName() {
        return this.firstname ;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }


}
