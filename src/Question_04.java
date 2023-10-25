
/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Question_04 {
    String name = "Prakash";
    String surname = "Sohan";
    static String name1 = "Tej";
    static String surname2 = "Sohan1";

    public void m1(){
        System.out.println(name1);
        System.out.println(surname2);
        System.out.println(name);
        System.out.println(surname);
    }
    public static void m2(){
        Question_04 e = new Question_04();


        System.out.println(e.name);
        System.out.println(e.surname);
        System.out.println(name1);
        System.out.println(surname2);
    }

    public static void main(String[] args) {
        Question_04 e = new Question_04();
        e.m1();

        m2();
    }

}
