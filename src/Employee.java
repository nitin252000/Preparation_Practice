import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;
    private boolean active;

    public Employee(int id, String name, String department,
                    double salary, int age,
                    String gender, boolean active) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(

                new Employee(101, "Ram", "IT", 80000, 25, "Male", true),
                new Employee(102, "Shyam", "HR", 50000, 30, "Male", true),
                new Employee(103, "Mohan", "IT", 90000, 28, "Male", false),
                new Employee(104, "Sita", "Finance", 75000, 27, "Female", true),
                new Employee(105, "Rani", "HR", 65000, 24, "Female", true),
                new Employee(106, "John", "IT", 120000, 35, "Male", true),
                new Employee(107, "David", "Finance", 95000, 40, "Male", false),
                new Employee(108, "Kavya", "IT", 70000, 26, "Female", true)

        );
        //Find All Employee Names
        employees.stream().map(Employee::getName).forEach(System.out::println);
        //Find Employees Salary Greater Than 70000
        employees.stream().filter(e->e.getSalary()>70000).forEach(System.out::println);
        //sort Employees By Salary Decending
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        //Highest Salary of Employee
        Employee e=employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Maximum salary of Employee"+e);
        //Find Lowest Salary Employee
        Employee e1=employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Minimum salary of Employee"+e1);
        //Group Employees By Department
        Map<String,List<Employee>> grp=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(grp);
        //Count Employees In Each Department
        Map<String,Long> grpc=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(grp);
        //Count Male and female
        Map<String,Long>cc=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(cc);
        //Second highest salary of employee
        Employee s2=employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
        //Sort By Salary and Name
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);
        //Average Salary
        Map<String,Double>map=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        //Gender Count
        Map<String,Long>gc=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        //Avergae Salary By Gender
        Map<String,Double>as=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Gender Count :"+gc);
        System.out.println("Average salary of gender :"+as);

        //Top 3 highest Paid Employee
        List<Employee>toppaidEmp=employees.stream().sorted((e0,e2)->Double.compare(e2.getSalary(), e0.getSalary())).limit(3).collect(Collectors.toList());
        toppaidEmp.forEach(System.out::println);
    }
}