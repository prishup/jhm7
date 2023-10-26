package stringhomework;
/*Write a java program to concat 2 string.
Expected output: I love java I dream java
*/

public class Question5 {
    String a= "I love java";
    String b= "I dream java";
    String concat = a + " "+ b;
    public static void main(String[] args) {
       Question5 t = new Question5();
       t.m1();
    }
    public void m1(){
        System.out.println(concat);

    }
}
