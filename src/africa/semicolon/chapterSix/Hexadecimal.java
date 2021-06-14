package africa.semicolon.chapterSix;

public class Hexadecimal {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Count \tBinary\t \tOctal \tHexadecimal");
        while(count <= 256){
            System.out.println(count + "\t\t" +numberToBase(count, 2) + "\t\t\t" + numberToBase(count, 8) +"\t\t\t" + numberToBase(count, 16));
            count++;
        }


    }

    public static String numberToBase(int number,int base){
        String result = "";
        int remainder;
        while (number != 0){
            remainder = number % base;
            if(remainder < 10) {
                result = (remainder) + result;
            }else {
                result = (char)(remainder - 10 + 'A') + result;
            }
            number /= base;
        }

        return result;
    }
}
