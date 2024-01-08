package lectures;

/*James Tronson CS145
 * a method two or more parameters
a return value
three types of primitives
a for loop
a while loop
an if/else statement
*/
public class review141Github {

    public static void main(String[] args) {
        int example = 0;
        double myDouble = 5.78;
        String myString = "hello world";
        boolean myBoolean = true;
        char myChar = 'a';
       
        System.out.println("Example number : " + example + "\nA double: " + myDouble + "\nA string: " + myString +
                "\nMy boolean is: " + myBoolean + "\nMy char is: " + myChar);
        System.out.println();
       
        ifElseExample(10 , 10);
        whileLoopExample();
        forLoopExample(15);

    }
   
    public static int ifElseExample(int x, int y) {
        if (x > y) {
            System.out.println("First number is bigger");
        }
        else if (x < y) {
            System.out.println("Second number is bigger");
        }
        else {
            System.out.println("Numbers are equal");
        }
        return x - y;
       
    }
    public static int whileLoopExample() {
        int start = 1;
        while (start <= 5) {
            System.out.print("|While loop ran : " + start + " times|  ");
            start++;
        }
        System.out.println();
        return start;
       
    }
   
    public static void forLoopExample(int maxNumber) {
        for (int i = 0; i < maxNumber; i++) {
            System.out.print("|" + i + "| ");
        }

       
    }

}