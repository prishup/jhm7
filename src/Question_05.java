/*
Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
 */
public class Question_05 {
    ;
    public void division(int a , int b ){
        System.out.println("division of a,b = " + (a / b));
    }
    public void subtraction(int a, int  b){
        System.out.println("subtraction of a,b = "+(a - b));
    }

    public static void addition(int a, int b){
        System.out.println("addition of a,b = " + (a + b));

    }
    public static void multiplication (int a , int b ){
        System.out.println("multiplication of a,b = " + (a*b));
    }


    public static void main(String[] args) {
        Question_05 t = new Question_05();
        t.division(8,4);
        t.subtraction(8,4 );
        addition(8,4);
        multiplication(8, 4);

    }

}
