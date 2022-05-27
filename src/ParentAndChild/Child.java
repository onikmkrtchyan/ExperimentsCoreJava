package ParentAndChild;

public class Child extends Parent{
    @Override
     void function() {
        System.out.println("Hello from CHILD");
    }

    void functionNoOverride(){
        System.out.println("functionNoOverride CHILD");
    }
}
