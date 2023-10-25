/*Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.

 */
public class Question_20 {
    static String name = "Spain";
    String name1 = "United Kingdom";
    public void homecountry (){
        System.out.println(name);
    }
    public static void holiday(){
        Question_20 t = new Question_20();
        System.out.println(t.name1);
    }

    public static void main(String[] args) {
        Question_20 t = new Question_20();
        holiday();
        t.homecountry();


    }


}
