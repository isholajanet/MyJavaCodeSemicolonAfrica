package africa.semicolon.chapterFourteen;

public class reverseString {
    public static void main(String[] args) {
        String number = "68573565 432+";
        for (int i = number.length()-1; i >= 0 ; i--) {
            System.out.print(number.charAt(i));
          int x = i == 5 ? number.length()-1 : (i);
          if(x > number.length()-5) {
              if ((x % 3 == 0)) {
                  System.out.print(" ");
              }
          }
        }
        int n = number.length();


    }
}
