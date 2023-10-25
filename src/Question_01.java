
/*
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.*/

public class Question_01 {
    String name ="Kinjal";
    String surname ="Shah";


    public void m1() {
        System.out.println(name);
        System.out.println(surname);
    }

    public static void main(String[] args) {
        Question_01 Q=new Question_01();
        Q.m1();



    }
}


