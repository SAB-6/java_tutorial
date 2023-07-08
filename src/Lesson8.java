public class Lesson8 {
    public static void main(String[] args) {

        String f = "1";

        if(f.equals("1")){
            System.out.println("a");
        }

        else if(f.equals("2")){
            System.out.println("b");
        }

        else if(f.equals("3")){
            System.out.println("c");
        }

        else if(f.equals("4")){
            System.out.println("d");
        }


        else {
            System.out.println("e");
        }

//        cleaner
        System.out.println("switch statement");
        switch(f){

            case "1": System.out.println("a");
                break;
            case "2": System.out.println("b");
                break;
            case "3": System.out.println("c");
                break;
            case "4": System.out.println("d");
                break;
            case "5": System.out.println("e");
            default: System.out.println("Enter a value between 1 and 5");
        }

//        Assignment
//        double t = Math.random() * 100;
        int t = (int)(Math.random() * 100);

        System.out.println(t);
//        System.out.println((int)t);

        if(t % 10 == 0 && t/10 != 0){
            System.out.print("Random number divisible by 10");
        }

        else if (t/10 == 0) {
            System.out.println("Random number is zero");
        }
        else{
            System.out.println("Random number not divisible by 10");
        }

        int k = 10;
        switch(k){

            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 90:
            case 100:
                System.out.println("k i s divisible by 10");
                break;
            default: System.out.println("A is not divisible by then or enter value is higher than 100");
        }

    }
}
