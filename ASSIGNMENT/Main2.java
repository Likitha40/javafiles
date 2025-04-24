interface A { 
    void Method(); 
} 
class B { 
    public void Method() { 
        System.out.println("My Method"); 
    } 
} 
class C extends B implements A { 
} 
class Main2 { 
    public static void main(String[] args) { 
        System.out.println("likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        A a = new C(); 
        a.Method(); 
    } 
}
