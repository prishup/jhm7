
/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Question_03 {
    String name = "Arpit";
    static String surname = "Shah";

    public void b1() {
        System.out.println(name);
        System.out.println(surname);

    }

    public static void b2() {
        Question_03 d = new Question_03();
        System.out.println(d.name);
        System.out.println(surname);
    }

    public static void main(String[] args) {
        Question_03 c = new Question_03();
        c.b1();
        b2();
    }
}