class software2 {
    public static void main(String[] args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        RegularEmployee employee = new RegularEmployee("Likitha", 24240);
        System.out.println("Regular Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        Manager manager = new Manager("Lekhya", 24241);
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        manager.bonus(5000); 
    }
}