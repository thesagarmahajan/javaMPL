package MultiLevelInheritance;

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.childClassMethod();
        childObj.parentClassMethod();
        childObj.grandParentClassMethod();
    }
}
