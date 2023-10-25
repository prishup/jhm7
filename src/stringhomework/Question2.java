package stringhomework;
/*Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”

 */
public class Question2 {
    public static void main(String[] args) {
        String trim = "  I love java  ";
        String trim1= trim.strip();

        System.out.println(trim);
        System.out.println("Expected output: " +trim1);
    }

    }


