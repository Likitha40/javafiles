class Employee {
    String name;
    String address;
    int salary;
    String jobtitle;

    Employee(String name, String address, int salary, String jobtitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobtitle = jobtitle;
    }

    public String name() {
        return name;
    }

    public String address() {
        return address;
    }

    public int salary() {
        return salary;
    }

    public String jobtitle() {
        return jobtitle;  // Fixed: was calling jobtitle() recursively
    }

    public double bonus() {
        return (salary * 0.10);
    }

    public void performancereport() {
        System.out.println("Employee name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobtitle);
    }
}

class Manager extends Employee {
    public int team;

    public Manager(String name, String address, int salary, String jobtitle, int team) {
        super(name, address, salary, jobtitle);
        this.team = team;
    }

    @Override
    public double bonus() {
        return (salary * 0.15);
    }

    public void manageproject() {
        System.out.println(name + " is managing a project with " + team + " members.");
    }
}

class Developer extends Employee{
    public String develop;

    public Developer(String name, String address, int salary, String jobtitle, String develop) {
        super(name, address, salary, jobtitle);
        this.develop = develop;
    }

    @Override
    public double bonus() {  
        return (salary * 0.13);
    }

    public void developcode() {  
        System.out.println(name + " is developing a website using " + develop);
    }
}

class Programmer extends Employee {
    public String program;

    public Programmer(String name, String address, int salary, String jobtitle, String program) {
        super(name, address, salary, jobtitle);
        this.program = program;
    }

    @Override
    public double bonus() {
        return (salary * 0.12);
    }

    public void codeproject() {  
        System.out.println(name + " is working on a project using " + program);
    }
}

public class Employee21 {
    public static void main(String[] args) {
        System.out.println("NAME:p.Likitha, SECTION:c,ROLL NO:AV.SC.U4CSE24240");
        
        Manager m = new Manager("Likitha", "St.avenue", 2500000, "Healthcare", 5);
        m.performancereport();
        System.out.println("Bonus given to Likitha is: " + m.bonus());
        m.manageproject();

        Developer d = new Developer("Lekhya", "westline", 2300000, "IT", "Javascript");
        d.performancereport();
        System.out.println("Bonus given to lekhya is: " + d.bonus());
        d.developcode();  
        
        Programmer p = new Programmer("honey", "southeast", 3000000, "Cybersecurity", "Java");
        p.performancereport();
        System.out.println("Bonus given to honey is: " + p.bonus());
        p.codeproject();  
    }
}
