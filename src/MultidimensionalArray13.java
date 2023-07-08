public class MultidimensionalArray13 {
    public static void main(String []args){

        int [][] a = {{1, 2,3,4,5,6}, {4,5,6,7,8,9}};



        // print the sum of multidimensional array
        int sum =0;
        for (int i=0; i <a.length; i++){

            for (int ii=0; ii < a[i].length; ii++)
            {
//                System.out.print(a[i][ii] + ", ");
                sum += a[i][ii];
            }
            System.out.println(sum);
        }



    }
}
