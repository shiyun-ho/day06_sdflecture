package sg.edu.nus.iss;

public class Employee {
    private Integer id; 
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer salary;

    
    


    public Employee(Integer id, String firstName, String lastName, Integer age, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    //generate constructors


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public Integer getSalary() {
        return salary;
    }


    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    //generate to string
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", salary=" + salary + "]";
    }
    
    
    
}
