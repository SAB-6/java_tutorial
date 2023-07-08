import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
//        String operation = r.nextLine();
    while (true) {
        String operation = r.nextLine();

        if (operation.equals("add")){
            int a = r.nextInt();
            int b = r.nextInt();
            System.out.println(a + b);
        }

        else if (operation.equals("subtract")){
            int a = r.nextInt();
            int b = r.nextInt();
            System.out.println(a - b);
        }

        else if (operation.equals("multiply")){
            int a = r.nextInt();
            int b = r.nextInt();
            System.out.println(a * b);
        }

        else if (operation.equals("divide")){
            int a = r.nextInt();
            int b = r.nextInt();
            System.out.println(a /b);
        }

        else if (operation.equals("break")){
            break;
        }
    }
}
}
