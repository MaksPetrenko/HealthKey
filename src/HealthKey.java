import java.io.PrintWriter;
import java.util.Scanner;
public class HealthKey {
    public static void main (String []args) throws Exception {

        System.out.println("You are welcomed by the program HealthKey!");

        Scanner s = new Scanner (System.in);
        System.out.print("Your name : ");
        String a = s.nextLine();
        System.out.print("Your age : ");
        int b = s.nextInt();
        System.out.print("Your gender male? : ");
        boolean c = s.nextBoolean();
        System.out.print("Your height : ");
        float d = s.nextFloat();
        System.out.print("Your weight : ");
        double e = s.nextDouble();

        System.out.println("Welcome on your journey to a healthy future " + a);

        double result = (e / d);
        System.out.println("Your body mass index = " + result);
        System.out.print("Please enter a file name to display the information : ");
        s.nextLine();
        String f= s.nextLine();

        PrintWriter printWriter = new PrintWriter(f+".txt");
        printWriter.println(result);
        printWriter.close();
    }
}
