
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public void run() {
        int i = 10;
        int k = 15;
        int a = 5;
        int b = 20;

        do {
            System.out.println("i is " + i + " but is less than 10 ");
            i += 1;
        } while (i < 15);
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k -= 1;
        } while (k > 5);
        do {
            System.out.println("a is " + a + " but is less than 10");
            System.out.println("b is " + b + " but less than or equal to 20");
            a += 1;
            b += 1;
        } while (a < 10 && b <= 20 );
    }

    public static void main(String[] args)
    {        
        RenameThisClass hw = new RenameThisClass();
        hw.run();
    }
}
