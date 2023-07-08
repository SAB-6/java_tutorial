public class ArrayLesson12 {
    public static void main(String[] args){

        int [] a = new int[4];
        boolean [] b = new boolean[5];
        String [] t = new String[5];

        a[0] = 10;
        a[1]= 20;
        a[2] = 30;
        a[3] = 40;

        b[0] = false;
        b[1] = true;
        b[2] = false;
        b[3] = true;

        t[0] = "I";
        t[1] = "am";
        t[2] = "your";
        t[3] = "grand";
        t[4] = "father";


        for (int i = 0; i <=3; i++){

            System.out.println(a[i]);
        }

        for (int i=0; i<=3; i++){
            System.out.println(b[i]);
        }

        System.out.println("Array of string");
        for (int i=0; i< t.length; i++ ){
            System.out.print(t[i]+" ");
        }

        String [] j = {"12", "13", "14", "15", "red", "blue"};

//        Add val to an array
        System.out.println("add value to an existing array");
        int [] h = {1, 2,3,4,5,6};
        int[] h1 = new int[h.length + 1];

        for ( int i=0; i < h.length; i++){
            h1[i] = h[i];
        }
        h = h1;
        h[5] = 6;

        for (int i =0; i < h.length -1; i++){
            System.out.println(h[i]);
        }


    }

}
