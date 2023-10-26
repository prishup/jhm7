package stringhomework;
/*
6. Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
 */

public class Question6 {
     static String a = "I@love@java";
   static  String b = a.replace("I@love@","We love ");
    public static void main(String[] args) {
        m1();

    }
    public static void m1(){
        System.out.println(b);
    }

}
