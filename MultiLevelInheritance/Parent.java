package MultiLevelInheritance;

public class Parent extends Grandparent{
    void parentClassMethod(){
        System.out.println("This is parentClassMethod");
        this.grandParentClassMethod();
    }
}
