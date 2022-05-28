package ParentAndChild;

public class ChildSecondExample extends ParentSecondExamole {
    @Override
     void function() {
        System.out.println("Hello from CHILD");
    }

    void functionNoOverride(){
        System.out.println("functionNoOverride CHILD");
    }
}
