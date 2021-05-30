package africa.semicolon.chapterFive;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = 1;
        String userInput = """
                Enter any day of your choice
                """;
        String firstDay = """
                On the first day of Christmas my true love sent to me
                """;
        String secondDay = """
                On the second day of Christmas my true love sent to me
                """;
        String thirdDay = """
                On the third day of Christmas my true love sent to me
                """;
        String fourthDay = """
                On the forth day of Christmas my true love sent to me
                """;
        String fifthDay = """
                On the fifth day of Christmas my true love sent to me
                """;
        String sixthDay = """
                On the sixth day of christmas my true love sent to me
                """;
        String seventhDay = """
                On the seventh day of christmas my true love sent to me
                """;
        String eighthDay = """
                On the eighth day of christmas my true love sent to me
                """;
        String ninthDay = """
                On the ninth day of christmas my true love sent to me
                """;
        String tenthDay = """
                On the tenth day of christmas my true love sent to me
                """;
        String eleventhDay = """
                On the eleventh day of christmas my true love sent to me
                """;
        String twelfthDay = """
                On the twelfth day of christmas my true love sent to me
                """;

        do{
            System.out.print(userInput);
            day = input.nextInt();
            switch (day){
                case 1:{
                    System.out.println(firstDay);
                    break;
                }
                case 2:{
                    System.out.println(secondDay);
                    break;
                }
                case 3:{
                    System.out.println(thirdDay);
                    break;
                }
                case 4: {
                    System.out.println(fourthDay);
                    break;
                }
                case 5: {
                    System.out.println(fifthDay);
                    break;
                }
                case 6:{
                    System.out.println(sixthDay);
                    break;
                }
                case 7:{
                    System.out.println(seventhDay);
                    break;
                }
                case 8:{
                    System.out.println(eighthDay);
                    break;
                }
                case 9:{
                    System.out.println(ninthDay);
                    break;
                }
                case 10:{
                    System.out.println(tenthDay);
                    break;
                }
                case 11:{
                    System.out.println(eleventhDay);
                    break;
                }
                case 12:{
                    System.out.println(twelfthDay);
                    break;
                } default:
                    System.out.println("Enter a valid day ");

            }
            switch (day){
                case 12:{
                    System.out.println("Twelve drummer drumming");
                }
                case 11:{
                    System.out.println("Eleven piper piping");
                }
                case 10:{
                    System.out.println("Ten lords a-leaping");
                }
                case 9:{
                    System.out.println("Nine ladies dancing");
                }
                case 8:{
                    System.out.println("Eight maids a-milking");
                }
                case 7:{
                    System.out.println("Seven swans a-swimming");
                }
                case 6:{
                    System.out.println("Six geese a-laying");
                }
                case 5:{
                    System.out.println("Five gold rings");
                }
                case 4:{
                    System.out.println("Four calling birds");
                }
                case 3:{
                    System.out.println("Three french hens");
                }
                case 2:{
                    System.out.println("Two turtle doves");
                }
                case 1:{
                    System.out.println("A patridge in a pear tree");
                }
            }
        }while (day <= 12);
        day++;
    }
}
