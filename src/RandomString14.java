public class RandomString14 {
    public static void main(String []args){
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String finalString = "";

        for (int i=0; i<10; i++){
            int idx = (int)(Math.random() * candidateChars.length());

//            int b = (int)(Math.random()*1000);
            finalString += candidateChars.charAt(idx);
        }
        System.out.println(finalString);
    }
}
