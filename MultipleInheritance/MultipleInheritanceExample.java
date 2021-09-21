package MultipleInheritance;
/* 
    Visualization of hybrid inheritance

        parent1         parent2

                Child1
        
                Subchild1       
                
                Subchild2
        
        Subchild3       Subchild4

*/

interface a{
    default void methoda(){
        System.out.println("This is MethodA");
    }
}

interface b{
    default void methodb(){
        System.out.println("This is MethodB");
    }
}

// interface c extends a, b{
    
// }

// Achieving multiple inheritance with interfaces
class d implements a,b{

}


// Achieving Hybrid Inheritance 
class e extends d{

}

class f extends d{

}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        d dobj = new d();
        dobj.methoda();
        dobj.methodb();
    }
}
