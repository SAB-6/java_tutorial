public class AnotherClass {
    public static void main(String[] args)
    {
        System.out.println("Hello from Another class");
        System.out.println("Integer.MAX_VALUE");
        System.out.println(Integer.MAX_VALUE);
        System.out.println("\n");
        System.out.println("Integer.MIN_VALUE");
        System.out.println(Integer.MIN_VALUE);
        System.out.println("\n");
        System.out.println("Long.MIN_VALUE");
        System.out.println(Long.MIN_VALUE);
        Long a = 2147483647L;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("Double");
        System.out.println(Double.MAX_EXPONENT);
        double f = 2.0;
        float d = 12.0F;
        System.out.println(Float.MAX_EXPONENT);

//        int a = 1;
        String a1 = String.valueOf(a);
        String b1 = "This number is: " + a;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("final line");

        // return indexed letter in a string

        String sampleString = "This is a string";
        System.out.println(sampleString.charAt(6));
        System.out.println(sampleString.substring(0,6));
        System.out.println(sampleString.length());
        System.out.println(sampleString == "This is a string");
        System.out.println(sampleString == "This is a string");
//        System.out.println(sampleString.equals(anObject));
        System.out.println(sampleString);
        System.out.println(sampleString.replaceAll(" is", " is not"));
        System.out.println(sampleString.replaceAll(" is", " is not").replaceAll("a string", "a boolean"));

        String a3, b, c, d1, e;
        a3 = "hi";
        b = "hey";
        c = "hello";
        d1 = "hows it going";
        e = "whats up";

        String result = String.valueOf(a3.charAt(0));
        result += b.charAt(0);
        result += c.charAt(0);
        result += d1.charAt(0);
        result += e.charAt(0);
        result += a3.charAt(a3.length()-1);
        result += b.charAt(b.length()-1);
        result += c.charAt(c.length()-1);
        result += d1.charAt(d1.length()-1);
        result += e.charAt(e.length()-1);

        System.out.println(result);




    }
}
