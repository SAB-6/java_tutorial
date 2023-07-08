public class RandomValues {
    public static void main(String []args)
    {
        double t = Math.random() * 60; // random values from 0 to 60
        System.out.println(t);
        int b = (int)(Math.random()*1000);
        System.out.println(b);
        int c = (int)(Math.random()*60)+30;
        System.out.println(c);

        int k = 5 + (int)(Math.random() * ((10-5) +1));
        System.out.println(k);


    }
}
