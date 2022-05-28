package ParentAndChild;

public class ParentSecondExamole {

    public static void main(String[] args) {
//        Child child1 = (Child)new ParentAndChild.Parent(); classCastException can't cast parent object to Child type
        ChildSecondExample childSecondExample = new ChildSecondExample();
        ParentSecondExamole parentSecondExamole = new ChildSecondExample();

        parentSecondExamole.function();
        childSecondExample.function();
        childSecondExample.functionNoOverride();
//        parent.functionNoOverride(); cant see child methods which is no overridden

    }

     void function(){
        System.out.println("hello from PARENT");
    }

}


