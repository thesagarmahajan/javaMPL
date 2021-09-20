package AccessModifiers;

public class a {
    void defaultMethod(){
        System.out.println("This is default Method: a");
    }

    public void publicMethod(){
        System.out.println("This is public Method: a");
    }

    private void privateMethod(){
        System.out.println("This is private Method: a");
    }

    protected void protectedMethod(){
        System.out.println("This is protected Method: a");
        this.privateMethod();
    }
}
