package ParentAndChild;

public class Parent {

    public static void main(String[] args) {
//        Child child1 = (Child)new Parent(); classCastException can't cast parent object to Child type
        Child child = new Child();
        Parent parent = new Child();

        parent.function();
        child.function();
        child.functionNoOverride();
//        parent.functionNoOverride(); cant see child methods which is no overridden

    }

     void function(){
        System.out.println("hello from PARENT");
    }

}


