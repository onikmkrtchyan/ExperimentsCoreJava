package Strings;

public class CompareTo {
    public static void main(String[] args) {
        String first =  "Some text need to compare by method compareTo";
        String second = "Some text need to compare by method compareTo";
        String third =  "Some text need to compare";
        System.out.println("first.compareTo(second) = " + first.compareTo(second));// 0
        System.out.println("first.compareTo(third) = " + first.compareTo(third));  // 20
        System.out.println("third.compareTo(first) = " + third.compareTo(first));  //-20
    }
}
