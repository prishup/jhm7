/*
17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.
 */
public class Question_17 {
    String city = "Ahmedabad";
    static String country = "India";

    public void m1() {
        System.out.println(country);
    }
        public static void m2(){
            Question_17 t = new Question_17();
            System.out.println(t.city);
    }

    public static void main(String[] args) {
        Question_17 t = new Question_17();
        t.m1();
        m2();

    }
    }



