/*
16. Write a Java Program to print as below. (All details to be stored in variable)
"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
 */
public class Question_16 {
    public static void main(String[] args) {
        String name = "CORNER STORE";
        int year = 2015;
        int month = 03;
        int date = 29;
        double gallon = 10.870d;
        double price = 2.89d;
        double fuel = 22.71d;
        float hrs = 04f;
        float min = 38f;

        System.out.println("+--------------------------+");
        System.out.println("|                          |");
        System.out.println("|     "+name+"         |");
        System.out.println("|                          |");
        System.out.println("| "+year+"-"+month+"-"+date+" "+hrs+":"+min+"PM"+"     |");
        System.out.println("|----------------------- --|");
        System.out.println("| Gallons: "+gallon+"           |");
        System.out.println("| Price/gallon: $ "+price+"     |");
        System.out.println("|                          |");
        System.out.println("| Fuel total: $ "+fuel+"      |");
        System.out.println("|                          |");
        System.out.println("|+------------------------+|");

    }
}
