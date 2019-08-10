import java.util.Scanner;
public class HealthKey {
    public static void main (String []args){

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


    }
}
