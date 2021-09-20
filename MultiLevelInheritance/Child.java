package MultiLevelInheritance;

public class Child extends Parent{
    void childClassMethod(){
        System.out.println("This is childClassMethod");
        this.parentClassMethod();
        this.grandParentClassMethod();
    }
}
