import java.util.Scanner;

public class ScannerClass {

    public static void main (String[] args)
    {
    Scanner r = new Scanner(System.in);
//    int a = r.nextInt();
//    System.out.println("Your number is "+a);
        int a = (int)(Math.random()*40);

        System.out.println("Enter number ");
        int b = r.nextInt();
        System.out.println(a + " + " + b + " is equal to "+(a+b));
//
//        String t = r.nextLine();
//        boolean y = r.nextBoolean();
//        long m = r.nextLong();
//        double j = r.nextDouble();

    }
}
