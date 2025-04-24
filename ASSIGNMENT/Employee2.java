public class Employee2 {
    public static void main(String[]args) {
        System.out.println("Likitha Lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        Employee e = new Employee("Aryan", 2400000);
        System.out.println(e.getname() + "'s basic salary is: " + e.getsalary());
        e.work();
        HRmanager hr = new HRmanager("prem", 100000);
        System.out.println(hr.getname() + "'s basic salary is: " + hr.getsalary());
        hr.work();
        hr.addEmployee("Likitha");
    }
}