package AccessModifiers;
import AccessModifiers.TestPackage.b;

public class AccessModifiersExample {
    public static void main(String[] args) {
        a aobj = new a();
        b bobj = new b();

        // From same package: Default, Public, Protected
        aobj.defaultMethod();
        aobj.publicMethod();
        aobj.protectedMethod();

        // From different package: Public
        bobj.publicMethod();
    }
}
