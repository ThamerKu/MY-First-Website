

package myfirstwebsite;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MyFirstWebsite {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name please :)");
           String name =n.nextLine();
        System.out.println("Hi \nWelcome to my website "+ name);
    }
}
