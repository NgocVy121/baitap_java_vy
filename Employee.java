public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(){
    }
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
        return firstName + " " + lastName;
    }

    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent) {
        if (percent > 0) {
            this.salary += this.salary * (percent / 100);
        }
        return percent;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName +lastName + ", salary=" + salary + "]";
    }



}
