public class VisibilityExample {
    public int publicVariable = 10;
    private int privateVariable = 20;
    public int getprivateVariable() {
      return privateVariable;
    }
    public void setprivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }
    public int PublicVariable() {
        return publicVariable;
    }
    public void publicMethod() {
        System.out.println("This is a public method");
        privateMethod();
    }
    private void privateMethod() {
        System.out.println("This is a private method");
    }
}
