package stringhomework;
/*
Write a Java program print your full name on screen and then print your
surname on a separate line.
 */

public class Question1 {
    String name = "Kinjal Shah";
    public void m1(){
        System.out.println("Full Name- "   + name);
        System.out.println("Surname-    "   + name.substring(7));

    }
    public static void main(String[] args) {
       Question1 t = new Question1();
       t.m1();
    }

}
