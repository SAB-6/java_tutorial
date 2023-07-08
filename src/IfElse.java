public class IfElse {
        public static void main(String[] args){
            int m = 5;
            if(m<2){
                System.out.println(" m is less tha 2");
            }
            else if (m==2){
                System.out.println("m is equal to 2");
            }
            else{
                System.out.println("m is greater than 2");
            }

            int a, b, c;
//            a = 16*76;
//            b = 98*73;
//            c = 87*65;

            a = 2;
            b = 2;
            c = 2;

            System.out.println(a + ", " + b + ", " + c );
            if (a > b && a >c){
                System.out.println("a has the highest value");
            }
            else if (b > a && b >c) {
                System.out.println("b  has the highest value");
            }
            else if (c > a && c >b) {
                System.out.println("c has the highest value");
            }

            else {
                System.out.println("All variables are equal");
            }



    }
}
