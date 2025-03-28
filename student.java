
public class Student {
    String name;
    double percentage;
    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    void getEligibility() {
        System.out.println(name + " is a student");
    }
}
class UGStudent extends Student {
    public UGStudent(String name, double percentage) {
        super(name, percentage);
    }
    void getEligibility() {
        if (percentage >= 60) {
            System.out.println(name + " is eligible for UG");
        } else {
            System.out.println(name + " is not eligible for UG");
        }
    }
}
class PGStudent extends Student {
    public PGStudent(String name, double percentage) {
        super(name, percentage);
    }
    void getEligibility() {
        if (percentage >= 70) {
            System.out.println(name + " is eligible for PG");
        } else {
            System.out.println(name + " is not eligible for PG");
        }
    }
}
 class Eligibility {
    public static void main(String[] args) {
        UGStudent ug1 = new UGStudent("Likitha", 40);
        PGStudent pg1 = new PGStudent("Lekhya", 45);

        ug1.getEligibility();
        pg1.getEligibility();
    }
}
