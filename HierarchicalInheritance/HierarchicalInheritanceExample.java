package HierarchicalInheritance;

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Child1 c1obj = new Child1();
        Child2 c2obj = new Child2();

        c1obj.child1Method1();
        c1obj.parent1Method1();

        c2obj.child2Method1();
        c2obj.parent1Method1();

        // Not Allowed
        // c1obj.child2Method1();
    }
}
