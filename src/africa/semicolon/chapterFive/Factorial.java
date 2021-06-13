package africa.semicolon.chapterFive;

public class Factorial {
    public static void main(String[] args) {
       int count = 1;
       long factorial = 1;
        System.out.println("Count \tFactorial");
       while(count <= 15){
           factorial = count * factorial;
           System.out.println(count + "\t\t" +factorial);
           count++;
       }

        }
    }

