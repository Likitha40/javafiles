// Base class
public class Software {
    private String name;
    private int employeeId;
    public Software(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
}
class RegularEmployee extends Software {
    public RegularEmployee(String name, int employeeId) {
        super(name, employeeId);
    }
}
class Manager extends Software {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    public void bonus(int bonus) {
        System.out.println("Bonus: " + bonus);
    }
}
