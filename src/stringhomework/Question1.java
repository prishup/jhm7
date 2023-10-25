package stringhomework;
/*
Write a Java program print your full name on screen and then print your
surname on a separate line.
 */

public class Question1 {
    public static void main(String[] args) {
        String name = "Kinjal Shah";
        System.out.println("Full Name- "   + name);
        System.out.println("Surname-    "   + name.substring(7));
    }

}
